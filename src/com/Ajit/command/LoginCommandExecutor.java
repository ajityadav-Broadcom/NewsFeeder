package com.Ajit.command;

import com.Ajit.exception.InvalidCommandException;
import com.Ajit.service.NewFeedService;

public class LoginCommandExecutor extends CommandExecutor {
    public LoginCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    private boolean validateCommand(String args[]) {
        if (args.length != 2) return false;
        if (args[1].isEmpty()) return false;
        return true;
    }

    @Override
    public void executeCommand(Command command) {
        if (!validateCommand(command.getArgs())) {
            throw new InvalidCommandException(command.getArgs().toString() + " invalid command is passed");
        }
        String args[] = command.getArgs();
        newFeedService.LoginUser(args[1]);
    }

}
