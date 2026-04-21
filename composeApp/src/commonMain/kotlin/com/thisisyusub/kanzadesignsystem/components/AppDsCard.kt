package com.thisisyusub.kanzadesignsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.thisisyusub.kanzadesignsystem.AppDsTheme

@Composable
fun AppDsCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(AppDsTheme.radii.lg),
        color = AppDsTheme.colors.surface,
        contentColor = AppDsTheme.colors.text,
        border = BorderStroke(
            width = AppDsTheme.size.borderWidth,
            color = AppDsTheme.colors.border
        )
    ) {
        Box(modifier = Modifier.padding(AppDsTheme.spacing.lg)) {
            content()
        }
    }
}