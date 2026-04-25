package com.thisisyusub.kanzadesignsystem.tokens

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal val LocalAppDsSpacing = compositionLocalOf { AppDsSpacing() }

@Immutable
data class AppDsSpacing(
    val xxs: Dp = 2.dp,
    val xs: Dp = 4.dp,
    val sm: Dp = 8.dp,
    val md: Dp = 12.dp,
    val lg: Dp = 16.dp,
    val xl: Dp = 24.dp,
    val xxl: Dp = 32.dp,
) : Iterable<Pair<String, Dp>> {
    override fun iterator(): Iterator<Pair<String, Dp>> {
        return listOf(
            "xxs" to xxs,
            "xs" to xs,
            "sm" to sm,
            "md" to md,
            "lg" to lg,
            "xl" to xl,
            "xxl" to xxl,
        ).iterator()
    }
}