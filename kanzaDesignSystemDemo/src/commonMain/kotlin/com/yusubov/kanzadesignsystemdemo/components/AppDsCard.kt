package com.yusubov.kanzadesignsystemdemo.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import com.thisisyusub.kanzadesignsystem.AppDsTheme
import com.thisisyusub.kanzadesignsystem.components.AppDsCard
import com.thisisyusub.kanzadesignsystem.components.AppDsText
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsCardUseCase() {
    useCase("AppDsCard") {
        val title = knob.string(label = "Title", initialValue = "Hello World!")
        val subtitle = knob.string(label = "Subtitle", initialValue = "How are you today!")

        AppDsCard {
            Column {
                AppDsText(text = title)
                Spacer(modifier = Modifier.padding(AppDsTheme.spacing.md))
                AppDsText(text = subtitle)
            }
        }
    }
 }