package com.yusubov.kanzadesignsystemdemo.foundation

import androidx.compose.foundation.lazy.grid.items
import com.thisisyusub.kanzadesignsystem.tokens.AppDsRadii
import com.yusubov.composebook.dsl.DirectoryBuilder
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoBoxView
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoVerticalGrid

internal fun DirectoryBuilder.radiiUseCase() {
    useCase("Radii") {
        DemoVerticalGrid {
            items(AppDsRadii().toList()) { (name, radius) ->
                DemoBoxView(
                    title = "$name: $radius",
                    radius = radius,
                )
            }
        }
    }
}