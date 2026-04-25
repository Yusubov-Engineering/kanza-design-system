package com.yusubov.kanzadesignsystemdemo.foundation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.thisisyusub.kanzadesignsystem.AppDsTheme
import com.thisisyusub.kanzadesignsystem.components.AppDsText

@Composable
internal fun DemoBoxView(
    title: String,
    color: Color = AppDsTheme.colors.background,
    radius: Dp = 4.dp,
    size: Dp = 100.dp,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .background(color = color, RoundedCornerShape(radius))
                .size(size)
                .border(
                    width = 1.dp,
                    color = AppDsTheme.colors.border,
                    shape = RoundedCornerShape(radius)
                )
        )
        Spacer(modifier = Modifier.padding(AppDsTheme.spacing.sm))
        AppDsText(text = title)
    }
}