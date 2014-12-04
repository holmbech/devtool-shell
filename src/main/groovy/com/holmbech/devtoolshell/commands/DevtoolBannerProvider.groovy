package com.holmbech.devtoolshell.commands

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.shell.plugin.support.DefaultBannerProvider
import org.springframework.stereotype.Component

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DevtoolBannerProvider extends DefaultBannerProvider {
    public String getBanner() {
        def bannerString = """
=======================================
*                                     *
*            Devtool Shell            *
*                                     *
=======================================
Version: $version"""
        return bannerString
    }

    public String getVersion() {
        return "1.0.9";
    }

    public String getWelcomeMessage() {
        return "Welcome to Devtool Shell. Type help for list of commands and/or use tab completion";
    }

    @Override
    public String getProviderName() {
        return "Devtool Banner";
    }

}
