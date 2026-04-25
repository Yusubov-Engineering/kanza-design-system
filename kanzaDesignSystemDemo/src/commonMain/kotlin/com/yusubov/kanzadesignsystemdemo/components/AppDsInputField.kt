package com.yusubov.kanzadesignsystemdemo.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowRight
import androidx.compose.material.icons.filled.Person
import com.thisisyusub.kanzadesignsystem.components.AppDsIcon
import com.thisisyusub.kanzadesignsystem.components.AppDsInputField
import com.thisisyusub.kanzadesignsystem.components.AppDsText
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsInputFieldUseCase() {
    useCase("AppDsInputField") {
        val text = knob.string(label = "text", initialValue = "Kanan Yusubov")
        val placeHolderText = knob.string(label = "Placeholder", initialValue = "Enter your name")

        val showPlaceHolder = knob.boolean(label = "Show placeholder", initialValue = true)
        val showLeadingIcon = knob.boolean(label = "Show leading icon", initialValue = true)
        val showTrailingIcon = knob.boolean(label = "Show trailing icon", initialValue = true)




        AppDsInputField(
            value = text,
            placeholder = {
                if (showPlaceHolder) {
                    AppDsText(text = placeHolderText)
                }
            },
            leadingIcon = {
                if (showLeadingIcon) {
                    AppDsIcon(imageVector = Icons.Default.Person)
                }
            },
            trailingIcon = {
                if (showTrailingIcon) {
                    AppDsIcon(imageVector = Icons.AutoMirrored.Filled.ArrowRight)
                }
            },
            onValueChange = {},
        )
    }
}