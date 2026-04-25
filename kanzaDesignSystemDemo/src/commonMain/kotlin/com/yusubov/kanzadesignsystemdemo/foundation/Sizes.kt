package com.yusubov.kanzadesignsystemdemo.foundation

import androidx.compose.foundation.lazy.grid.items
import com.thisisyusub.kanzadesignsystem.tokens.AppDsSize
import com.yusubov.composebook.dsl.DirectoryBuilder
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoBoxView
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoVerticalGrid

internal fun DirectoryBuilder.sizesUseCase() {
    useCase("Sizes") {
        DemoVerticalGrid {
            items(AppDsSize().toList()) { (name, size) ->
                DemoBoxView(
                    title = "$name - $size",
                    size = size,
                )
            }
        }
    }
}