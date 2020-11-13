package com.Ajit.command;

import com.Ajit.exception.InvalidCommandException;
import com.Ajit.service.NewFeedService;

public class SignUpCommandExecutor extends CommandExecutor {
    public SignUpCommandExecutor(NewFeedService newFeedService) {
        super(newFeedService);
    }

    private boolean validateCommand(String args[]) {
        if (args.length != 3) return false;
        if (args[1].isEmpty() || args[2].isEmpty()) return false;
        return true;
    }

    @Override
    public void executeCommand(Command command) {
        if (!validateCommand(command.getArgs())) {
            throw new InvalidCommandException("Invalid command ");
        }

    }
}
