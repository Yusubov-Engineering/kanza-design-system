package com.thisisyusub.kanzadesignsystem.tokens


import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

internal val LocalAppDsTypography = compositionLocalOf { AppDsTypography() }

@Immutable
data class AppDsTypography(
    val heading: TextStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold),
    val body: TextStyle = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal),
    val bodySmall: TextStyle = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal),
    val label: TextStyle = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Medium),
    val caption: TextStyle = TextStyle(fontSize = 10.sp, fontWeight = FontWeight.Normal),
): Iterable<Pair<String, TextStyle>> {
    override operator fun iterator(): Iterator<Pair<String, TextStyle>> {
        return listOf(
            "heading" to heading,
            "body" to body,
            "bodySmall" to bodySmall,
            "label" to label,
            "caption" to caption
        ).iterator()
    }
}