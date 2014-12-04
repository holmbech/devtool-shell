package com.holmbech.devtoolshell.commands

import groovy.transform.ToString;

@ToString
public class Tool {
    String toolName

    public Tool(String toolName) {
        this.toolName = toolName
    }
}
