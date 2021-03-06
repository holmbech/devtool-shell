package com.holmbech.devtoolshell;

import org.springframework.shell.Bootstrap;

import java.io.IOException;

public class Main {
    /**
     * Main class that delegates to Spring Shell's Bootstrap class in order to simplify debugging inside an IDE
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Bootstrap.main(args);

    }

}
