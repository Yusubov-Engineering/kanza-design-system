package com.thisisyusub.kanzadesignsystem.components

import androidx.compose.runtime.Composable

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.thisisyusub.kanzadesignsystem.AppDsTheme

@Composable
fun AppDsToggle(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    val trackColor by animateColorAsState(
        targetValue = if (checked) AppDsTheme.colors.componentActive
        else AppDsTheme.colors.surfaceVariant,
        label = "TrackColor"
    )

    val thumbOffset by animateDpAsState(
        targetValue = if (checked) {
            AppDsTheme.size.toggleWidth -
                    AppDsTheme.size.toggleThumb -
                    AppDsTheme.spacing.xs
        } else {
            AppDsTheme.spacing.xs
        },
        animationSpec = tween(150),
        label = "ThumbOffset"
    )

    Box(
        modifier = modifier
            .size(
                width = AppDsTheme.size.toggleWidth,
                height = AppDsTheme.size.toggleHeight,
            )
            .clip(RoundedCornerShape(AppDsTheme.radii.pill))
            .background(trackColor)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onCheckedChange(!checked) },
        contentAlignment = Alignment.CenterStart
    ) {
        Box(
            modifier = Modifier
                .offset(x = thumbOffset)
                .size(AppDsTheme.size.toggleThumb)
                .clip(RoundedCornerShape(AppDsTheme.radii.pill))
                .background(AppDsTheme.colors.onComponentActive)
        )
    }
}