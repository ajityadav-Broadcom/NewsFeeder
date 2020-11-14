package com.Ajit;

import com.Ajit.Mode.FileMode;
import com.Ajit.Mode.Mode;
import com.Ajit.commandFactory.CommandFactory;
import com.Ajit.service.NewFeedService;

public class Main {

    public static void main(String[] args) {
        CommandFactory commandFactory = CommandFactory.getInstance(new NewFeedService());
        Mode mode = getModeOfInteraction(args, commandFactory);
        mode.startProcess();
    }

    private static Mode getModeOfInteraction(String args[], CommandFactory commandFactory) {
        return new FileMode(commandFactory, "D:\\NewsFeeder\\resources\\input.txt");
    }

}
