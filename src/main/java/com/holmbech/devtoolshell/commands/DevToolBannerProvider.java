package com.holmbech.devtoolshell.commands;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DevtoolBannerProvider extends DefaultBannerProvider {
    public String getBanner() {
        StringBuffer buf = new StringBuffer();
        buf.append("=======================================" + OsUtils.LINE_SEPARATOR);
        buf.append("*                                     *" + OsUtils.LINE_SEPARATOR);
        buf.append("*            Devtool Shell            *" + OsUtils.LINE_SEPARATOR);
        buf.append("*                                     *" + OsUtils.LINE_SEPARATOR);
        buf.append("=======================================" + OsUtils.LINE_SEPARATOR);
        buf.append("Version:" + this.getVersion());
        return buf.toString();
    }

    public String getVersion() {
        return "1.0.9";
    }

    public String getWelcomeMessage() {
        return "Welcome to Devtool Shell";
    }

    @Override
    public String getProviderName() {
        return "Devtool Banner";
    }

}
