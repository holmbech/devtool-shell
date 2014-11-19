package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.CommandMarker
import org.springframework.shell.core.annotation.CliCommand
import org.springframework.stereotype.Component

@Component
class ListUpdatesCommand implements CommandMarker {

    @CliCommand(value = "listUpdates", help = "List all available updates")
    public String listUpdates() {

    }
}
