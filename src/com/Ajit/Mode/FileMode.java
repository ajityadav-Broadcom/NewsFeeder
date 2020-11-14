package com.Ajit.Mode;

import com.Ajit.command.Command;
import com.Ajit.commandFactory.CommandFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileMode extends Mode {
    private String filePath;

    public FileMode(CommandFactory commandFactory, String filePath) {
        super(commandFactory);
        this.filePath = filePath;
    }

    @Override
    public void startProcess() {
        File file = new File(filePath);
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (!line.isEmpty()) {
                Command command = new Command(line);
                processCommand(command);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
