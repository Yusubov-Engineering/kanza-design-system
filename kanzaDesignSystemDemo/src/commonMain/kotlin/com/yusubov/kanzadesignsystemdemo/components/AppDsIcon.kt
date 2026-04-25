package com.yusubov.kanzadesignsystemdemo.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Announcement
import com.thisisyusub.kanzadesignsystem.components.AppDsIcon
import com.thisisyusub.kanzadesignsystem.tokens.AppDsSize
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsIconUseCase() {
    useCase("AppDsIcon") {
        val size = knob.dropdown(label = "Size", options = AppDsSize().toList())

        AppDsIcon(
            imageVector = Icons.AutoMirrored.Default.Announcement,
            size = size.second,
        )
    }
}