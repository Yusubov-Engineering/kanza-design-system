package com.yusubov.kanzadesignsystemdemo.foundation

import androidx.compose.foundation.lazy.grid.items
import com.thisisyusub.kanzadesignsystem.tokens.AppDsSpacing
import com.yusubov.composebook.dsl.DirectoryBuilder
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoBoxView
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoVerticalGrid

internal fun DirectoryBuilder.spacingUseCase() {
    useCase("Spacing") {
        DemoVerticalGrid {
            items(AppDsSpacing().toList()) { (name, space) ->
                DemoBoxView(
                    title = "$name - $space",
                    size = space,
                )
            }
        }
    }
}