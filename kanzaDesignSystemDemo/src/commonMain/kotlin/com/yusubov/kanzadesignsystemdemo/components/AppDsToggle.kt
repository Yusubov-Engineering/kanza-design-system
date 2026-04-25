package com.yusubov.kanzadesignsystemdemo.components

import com.thisisyusub.kanzadesignsystem.components.AppDsToggle
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsToggleUseCase() {
    useCase("AppDsToggle") {
        val checked = knob.boolean(label = "enabled", initialValue = true)

        AppDsToggle(
            checked = checked,
            onCheckedChange = {}
        )
    }
}