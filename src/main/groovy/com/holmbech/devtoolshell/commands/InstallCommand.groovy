package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.CommandMarker
import org.springframework.shell.core.annotation.CliCommand
import org.springframework.shell.core.annotation.CliOption
import org.springframework.stereotype.Component

@Component
class InstallCommand implements CommandMarker {

    @CliCommand(value = "install", help = "Installs a tool. ie: \"install --tool jdk --version 1.5.0\". Or just \"install --tool jdk\" for the latest version")
    public String install(
            @CliOption(key = ["tool"], help = "The tool", mandatory = true) final Tool tool,
            @CliOption(key = ["version"], help = "The version to install", mandatory = false) final ToolVersion toolVersion
    ) {
        println "tool = $tool"
        println "toolVersion = $toolVersion"
    }

}
