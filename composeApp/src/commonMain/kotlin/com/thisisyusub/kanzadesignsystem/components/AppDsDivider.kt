package com.thisisyusub.kanzadesignsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.thisisyusub.kanzadesignsystem.AppDsTheme

@Composable
fun AppDsHorizontalDivider(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(AppDsTheme.size.divider)
            .background(AppDsTheme.colors.border)
    )
}

@Composable
fun AppDsVerticalDivider(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .width(AppDsTheme.size.divider)
            .background(AppDsTheme.colors.border)
    )
}