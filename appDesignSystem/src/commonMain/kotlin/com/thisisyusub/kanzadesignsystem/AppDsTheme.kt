package com.thisisyusub.kanzadesignsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.thisisyusub.kanzadesignsystem.tokens.AppDsColors
import com.thisisyusub.kanzadesignsystem.tokens.AppDsRadii
import com.thisisyusub.kanzadesignsystem.tokens.AppDsSize
import com.thisisyusub.kanzadesignsystem.tokens.AppDsSpacing
import com.thisisyusub.kanzadesignsystem.tokens.AppDsTypography
import com.thisisyusub.kanzadesignsystem.tokens.DarkColors
import com.thisisyusub.kanzadesignsystem.tokens.LightColors
import com.thisisyusub.kanzadesignsystem.tokens.LocalAppDsColors
import com.thisisyusub.kanzadesignsystem.tokens.LocalAppDsRadii
import com.thisisyusub.kanzadesignsystem.tokens.LocalAppDsSize
import com.thisisyusub.kanzadesignsystem.tokens.LocalAppDsSpacing
import com.thisisyusub.kanzadesignsystem.tokens.LocalAppDsTypography


@Composable
fun AppDsTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (isDark) DarkColors else LightColors
    val typography = AppDsTypography()

    val resolvedTypography = AppDsTypography(
        heading = typography.heading.copy(color = colors.text),
        body = typography.body.copy(color = colors.text),
        bodySmall = typography.bodySmall.copy(color = colors.textSecondary),
        label = typography.label.copy(color = colors.text),
        caption = typography.caption.copy(color = colors.textSecondary),
    )

    CompositionLocalProvider(
        LocalAppDsColors provides if (isDark) DarkColors else LightColors,
        LocalAppDsTypography provides resolvedTypography,
        LocalAppDsSpacing provides AppDsSpacing(),
        LocalAppDsRadii provides AppDsRadii(),
        LocalAppDsSize provides AppDsSize(),
    ) {
        content()
    }
}

object AppDsTheme {
    val colors: AppDsColors
        @Composable @ReadOnlyComposable
        get() = LocalAppDsColors.current

    val typography: AppDsTypography
        @Composable @ReadOnlyComposable
        get() = LocalAppDsTypography.current

    val spacing: AppDsSpacing
        @Composable @ReadOnlyComposable
        get() = LocalAppDsSpacing.current

    val radii: AppDsRadii
        @Composable @ReadOnlyComposable
        get() = LocalAppDsRadii.current

    val size: AppDsSize
        @Composable @ReadOnlyComposable
        get() = LocalAppDsSize.current
}