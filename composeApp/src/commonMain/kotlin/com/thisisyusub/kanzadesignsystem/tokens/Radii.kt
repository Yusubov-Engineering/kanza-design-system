package com.thisisyusub.kanzadesignsystem.tokens

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal val LocalAppDsRadii = compositionLocalOf { AppDsRadii() }

@Immutable
data class AppDsRadii(
    val xs: Dp = 4.dp,
    val sm: Dp = 6.dp,
    val md: Dp = 8.dp,
    val lg: Dp = 12.dp,
    val xl: Dp = 16.dp,
    val pill: Dp = 100.dp,
)