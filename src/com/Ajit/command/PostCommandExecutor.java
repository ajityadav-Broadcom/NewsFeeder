package com.Ajit.command;

import com.Ajit.Modal.Post;
import com.Ajit.exception.InvalidCommandException;
import com.Ajit.service.NewFeedService;

public class PostCommandExecutor extends CommandExecutor {
    public PostCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    private boolean validateCommand(String[] args) {
        if (args.length != 2) return false;
        if (args[1].isEmpty()) return false;
        return true;
    }

    @Override
    public void executeCommand(Command command) {
        if (!validateCommand(command.getArgs())) {
            throw new InvalidCommandException(command.getArgs().toString() + " Invalid command is  passed for execution");
        }
        String[] args = command.getArgs();
        Post post = new Post(args[1]);
        newFeedService.addPost(post);
    }
}
