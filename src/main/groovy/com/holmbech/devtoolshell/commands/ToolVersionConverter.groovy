package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.Completion
import org.springframework.shell.core.Converter
import org.springframework.shell.core.MethodTarget
import org.springframework.stereotype.Component

@Component
class ToolVersionConverter implements Converter<ToolVersion> {
    @Override
    boolean supports(Class<?> type, String optionContext) {
        return ToolVersion.class.isAssignableFrom(type)
    }

    @Override
    ToolVersion convertFromText(String value, Class<?> targetType, String optionContext) {
        return new ToolVersion(value)
    }

    @Override
    boolean getAllPossibleValues(List<Completion> completions, Class<?> targetType, String existingData, String optionContext, MethodTarget target) {
        completions.add(new Completion("1.1"))
        completions.add(new Completion("1.2"))
        completions.add(new Completion("2.0"))
        return false
    }
}
