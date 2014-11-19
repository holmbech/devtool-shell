package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.CommandMarker
import org.springframework.shell.core.annotation.CliCommand
import org.springframework.stereotype.Component

@Component
class ListCommand implements CommandMarker {

    @CliCommand(value = "list", help = "List all tools")
    public String list() {

    }
}
