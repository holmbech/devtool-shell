package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.CommandMarker
import org.springframework.shell.core.annotation.CliCommand
import org.springframework.stereotype.Component

@Component
class InstallCommand implements CommandMarker {

    @CliCommand(value = "install", help = "Install the given tool with the specific version ie: \"jdk 1.5.0\". Or just \"jdk\" for the latest version")
    public String install() {

    }

}
