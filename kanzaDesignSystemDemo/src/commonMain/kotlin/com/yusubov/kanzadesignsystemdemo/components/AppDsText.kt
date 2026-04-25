package com.yusubov.kanzadesignsystemdemo.components

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraLight
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.font.FontWeight.Companion.Normal
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.text.font.FontWeight.Companion.Thin
import androidx.compose.ui.text.font.FontWeight.Companion.W100
import androidx.compose.ui.text.font.FontWeight.Companion.W200
import androidx.compose.ui.text.font.FontWeight.Companion.W300
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W600
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.text.font.FontWeight.Companion.W900
import com.thisisyusub.kanzadesignsystem.AppDsTheme
import com.thisisyusub.kanzadesignsystem.components.AppDsText
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsTextUseCase() {
    useCase("AppDsText") {
        val text = knob.string(label = "text", initialValue = "Text")

        val style = knob.dropdown(
            label = "Style", options = AppDsTheme.typography.toList(),
            labelMapper = { it.first })

        val color = knob.dropdown(
            label = "Color", options = AppDsTheme.colors.toList(),
            labelMapper = { it.first })

        val fontWeight = knob.dropdown(
            label = "Font weight", options = fontWeightValues(),
            labelMapper = { it.toString() })

        AppDsText(
            text = text,
            style = style.second,
            color = color.second,
            fontWeight = fontWeight,
        )
    }
}

private fun fontWeightValues(): List<FontWeight> =
    listOf(
        W100, W200, W300, W400, W500, W600, W700, W800, W900,
        Thin,
        ExtraLight,
        Light,
        Normal,
        Medium,
        SemiBold,
        Bold,
        ExtraBold,
        Black,
    )

