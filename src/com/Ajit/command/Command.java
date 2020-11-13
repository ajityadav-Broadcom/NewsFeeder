package com.Ajit.command;

import com.Ajit.exception.InvalidCommandException;

public class Command {
    private String commandType;
    private String[] args;

    public Command(String inputCommand) {
        String input[] = inputCommand.split("~");
        if (input.length < 1) throw new InvalidCommandException("Invalid command Exception" + inputCommand);
        this.commandType = input[0];
        this.args = input;
    }

    public String getCommandType() {
        return commandType;
    }

    public String[] getArgs() {
        return args;
    }
}
