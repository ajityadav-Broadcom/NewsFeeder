package com.Ajit.Mode;

import com.Ajit.command.Command;
import com.Ajit.commandFactory.CommandFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InteractiveMode extends Mode {
    public InteractiveMode(CommandFactory commandFactory) {
        super(commandFactory);
    }

    @Override
    public void startProcess() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                Command command = new Command(line);
                if (command.getCommandType().equals("Exit")) {
                    break;
                }
                processCommand(command);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
