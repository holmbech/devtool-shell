package com.holmbech.devtoolshell.commands

import org.springframework.shell.core.Completion
import org.springframework.shell.core.Converter
import org.springframework.shell.core.MethodTarget
import org.springframework.stereotype.Component

@Component
class ToolConverter implements Converter<Tool> {
    @Override
    boolean supports(Class<?> type, String optionContext) {
        return Tool.class.isAssignableFrom(type)
    }

    @Override
    Tool convertFromText(String value, Class<?> targetType, String optionContext) {
        return new Tool(value)
    }

    @Override
    boolean getAllPossibleValues(List<Completion> completions, Class<?> targetType, String existingData, String optionContext, MethodTarget target) {
        completions.add(new Completion("test"))
        completions.add(new Completion("test2"))
        completions.add(new Completion("test3"))
        return false
    }
}
