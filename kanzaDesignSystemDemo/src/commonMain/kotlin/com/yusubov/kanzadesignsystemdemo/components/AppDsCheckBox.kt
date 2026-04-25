package com.yusubov.kanzadesignsystemdemo.components

import com.thisisyusub.kanzadesignsystem.components.AppDsCheckBox
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsCheckBoxUseCase() {
    useCase("AppDsCheckBox") {
        val checked = knob.boolean(label = "enabled", initialValue = true)
        val label = knob.string(label = "label", initialValue = "enabled")

        AppDsCheckBox(
            checked = checked,
            label = label,
            onCheckedChange = {}
        )
    }
}