package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.CommandMarker
import org.springframework.shell.core.annotation.CliCommand
import org.springframework.stereotype.Component

@Component
class UpdateAllCommand implements CommandMarker {

    @CliCommand(value = "updateAll", help = "Updateda all your local tools to the newest version")
    public String updateAll() {

    }
}
