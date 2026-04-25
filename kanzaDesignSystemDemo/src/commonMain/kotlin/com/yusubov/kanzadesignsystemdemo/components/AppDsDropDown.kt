package com.yusubov.kanzadesignsystemdemo.components

import com.thisisyusub.kanzadesignsystem.components.AppDsDropDown
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsDropDownUseCase() {
    useCase("AppDsDropDown") {
        val options = listOf("A", "B", "C", "D", "E")
        val option = knob.dropdown("options", options = listOf("A", "B", "C", "D", "E"))

        AppDsDropDown(
            selectedOption = option,
            options = options,
            onOptionSelected = {},
        )
    }
}