package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.CommandMarker
import org.springframework.shell.core.annotation.CliCommand
import org.springframework.stereotype.Component

@Component
class SetupCommand implements CommandMarker {

    @CliCommand(value = "setup", help = "Setup a tool")
    public String setup() {

    }
}
