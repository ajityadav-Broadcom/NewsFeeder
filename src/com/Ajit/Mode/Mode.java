package com.Ajit.Mode;

import com.Ajit.command.Command;
import com.Ajit.command.CommandExecutor;
import com.Ajit.commandFactory.CommandFactory;

public abstract class Mode {
    private CommandFactory commandFactory;

    public Mode(CommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }

    protected void processCommand(Command command) {
        commandFactory.executeCommand(command);
    }

    public abstract void startProcess();
}
