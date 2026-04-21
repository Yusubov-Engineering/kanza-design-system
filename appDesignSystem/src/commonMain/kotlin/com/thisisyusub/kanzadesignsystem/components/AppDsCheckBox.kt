package com.thisisyusub.kanzadesignsystem.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.thisisyusub.kanzadesignsystem.AppDsTheme

@Composable
fun AppDsCheckBox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (checked) AppDsTheme.colors.component
        else Color.Transparent,
        label = "BgColor"
    )
    val borderColor by animateColorAsState(
        targetValue = if (checked) AppDsTheme.colors.component
        else AppDsTheme.colors.border,
        label = "BorderColor"
    )

    Row(
        modifier = modifier.clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null
        ) { onCheckedChange(!checked) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(AppDsTheme.size.iconLg)
                .clip(RoundedCornerShape(AppDsTheme.radii.sm))
                .background(backgroundColor)
                .border(
                    width = AppDsTheme.size.borderWidth,
                    color = borderColor,
                    shape = RoundedCornerShape(AppDsTheme.radii.sm)
                ),
            contentAlignment = Alignment.Center
        ) {
            if (checked) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    tint = AppDsTheme.colors.onComponent,
                    modifier = Modifier.size(AppDsTheme.size.iconMd)
                )
            }
        }

        if (label != null) {
            Spacer(modifier = Modifier.width(AppDsTheme.spacing.sm))
            Text(
                text = label,
                style = AppDsTheme.typography.body,
                color = AppDsTheme.colors.text
            )
        }
    }
}