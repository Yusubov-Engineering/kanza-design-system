package com.yusubov.kanzadesignsystemdemo.foundation

import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.thisisyusub.kanzadesignsystem.tokens.DarkColors
import com.thisisyusub.kanzadesignsystem.tokens.LightColors
import com.yusubov.composebook.dsl.DirectoryBuilder
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoBoxView
import com.yusubov.kanzadesignsystemdemo.foundation.views.DemoVerticalGrid

internal fun DirectoryBuilder.lightColorsUseCase() {
    useCase("Light colors") {
        DemoVerticalGrid {
            items(LightColors.toList()) { (name, color) ->
                DemoBoxView(
                    title = "$name: ${color.toRgbHex()}",
                    color = color,
                )
            }
        }
    }
}

internal fun DirectoryBuilder.darkColorsUseCase() {
    useCase("Dark colors") {
        DemoVerticalGrid {
            items(DarkColors.toList()) { (name, color) ->
                DemoBoxView(
                    title = "$name: ${color.toRgbHex()}",
                    color = color,
                )
            }
        }
    }
}

/**
 * Returns a 6-character RGB hex string (e.g., "#FF0000").
 * Ignores the alpha (transparency) channel.
 */
private fun Color.toRgbHex(): String {
    // 1. Convert to ARGB integer
    // 2. Use bitwise AND to strip out the alpha channel
    // 3. Convert to a base-16 string
    // 4. Pad with leading zeros if necessary
    // 5. Capitalize it
    val rgb = this.toArgb() and 0xFFFFFF
    return "#" + rgb.toString(16).padStart(6, '0').uppercase()
}