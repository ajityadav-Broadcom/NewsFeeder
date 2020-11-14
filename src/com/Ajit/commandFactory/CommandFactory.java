package com.Ajit.commandFactory;


import com.Ajit.command.*;
import com.Ajit.exception.InvalidCommandException;
import com.Ajit.service.NewFeedService;


import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private Map<String, CommandExecutor> commandExecutorMap;
    private static CommandFactory _instance;

    private CommandFactory(final NewFeedService newFeedService) {
        this.commandExecutorMap = new HashMap<>();
        commandExecutorMap.put("Signup", new SignUpCommandExecutor(newFeedService));
        commandExecutorMap.put("Login", new LoginCommandExecutor(newFeedService));
        commandExecutorMap.put("Post", new PostCommandExecutor(newFeedService));
        commandExecutorMap.put("Follow_User", new FollowCommandExecutor(newFeedService));
        commandExecutorMap.put("DownVote", new DownVoteCommandExecutor(newFeedService));
        commandExecutorMap.put("UpVote", new UpVoteCommandExecutor(newFeedService));
        commandExecutorMap.put("ShowNewsFeed", new ShowNewsFeedCommandExecutor(newFeedService));
        commandExecutorMap.put("Reply", new ReplyCommandExecutor(newFeedService));
    }

    public static synchronized CommandFactory getInstance(final NewFeedService newFeedService) {
        if (_instance == null) {
            _instance = new CommandFactory(newFeedService);
        }
        return _instance;
    }

    public void executeCommand(Command command) {
        if (!commandExecutorMap.containsKey(command.getCommandType())) {
            System.out.println(command.getCommandType());
            throw new InvalidCommandException("UNKnown Command is passed to process" + command.getArgs().toString());
        }
        commandExecutorMap.get(command.getCommandType()).executeCommand(command);
    }
}
