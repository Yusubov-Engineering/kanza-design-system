package com.thisisyusub.kanzadesignsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.thisisyusub.kanzadesignsystem.AppDsTheme

@Composable
fun AppDsDropDown(
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null
) {
    var expanded by remember { mutableStateOf(false) }

    Column(modifier = modifier) {
        if (label != null) {
            Text(
                text = label,
                style = AppDsTheme.typography.label,
                color = AppDsTheme.colors.textSecondary,
                modifier = Modifier.padding(bottom = AppDsTheme.spacing.xs)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(AppDsTheme.size.inputHeight)
                .clip(RoundedCornerShape(AppDsTheme.radii.md))
                .background(AppDsTheme.colors.surfaceVariant)
                .border(
                    width = AppDsTheme.size.borderWidth,
                    color = AppDsTheme.colors.border,
                    shape = RoundedCornerShape(AppDsTheme.radii.md)
                )
                .clickable { expanded = true }
                .padding(horizontal = AppDsTheme.spacing.md),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = selectedOption,
                    style = AppDsTheme.typography.body,
                    color = AppDsTheme.colors.text,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Dropdown",
                    tint = AppDsTheme.colors.textSecondary
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.background(AppDsTheme.colors.surface)
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                text = option,
                                style = AppDsTheme.typography.body,
                                color = AppDsTheme.colors.text
                            )
                        },
                        onClick = {
                            onOptionSelected(option)
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}