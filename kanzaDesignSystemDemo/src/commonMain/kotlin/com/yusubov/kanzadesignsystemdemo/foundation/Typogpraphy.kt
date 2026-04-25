package com.yusubov.kanzadesignsystemdemo.foundation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.thisisyusub.kanzadesignsystem.AppDsTheme
import com.thisisyusub.kanzadesignsystem.components.AppDsText
import com.thisisyusub.kanzadesignsystem.tokens.AppDsTypography
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.typographyUseCase() {
    useCase("Typography") {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            AppDsTypography().toList().forEach { (name, style) ->
                TypographyDemoView(
                    modifier = Modifier.padding(8.dp),
                    typographyName = name,
                    style = style,
                    text = "Hello World"
                )
            }
        }
    }
}

@Composable
private fun TypographyDemoView(
    modifier: Modifier = Modifier,
    text: String,
    typographyName: String,
    style: TextStyle,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppDsText(text = text, style = style)
        Spacer(modifier = Modifier.padding(4.dp))
        AppDsText(text = "($typographyName)", style = AppDsTheme.typography.caption)
    }
}