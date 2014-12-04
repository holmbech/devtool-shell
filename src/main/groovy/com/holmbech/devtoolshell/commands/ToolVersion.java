package com.holmbech.devtoolshell.commands;

import groovy.transform.ToString;

@ToString
public class ToolVersion {
    String version;

    public ToolVersion(String version) {

        this.version = version;
    }
}
