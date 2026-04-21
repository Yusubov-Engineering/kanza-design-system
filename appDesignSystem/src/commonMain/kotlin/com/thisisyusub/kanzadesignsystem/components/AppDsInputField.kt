package com.thisisyusub.kanzadesignsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import com.thisisyusub.kanzadesignsystem.AppDsTheme

@Composable
fun AppDsInputField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = true,
) {
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = AppDsTheme.typography.body.copy(
            color = AppDsTheme.colors.text
        ),
        // Restoring the keyboard logic
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        cursorBrush = SolidColor(AppDsTheme.colors.component),
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(AppDsTheme.size.inputHeight)
                    .background(
                        color = AppDsTheme.colors.surfaceVariant,
                        shape = RoundedCornerShape(AppDsTheme.radii.md)
                    )
                    .border(
                        width = AppDsTheme.size.borderWidth,
                        color = AppDsTheme.colors.border,
                        shape = RoundedCornerShape(AppDsTheme.radii.md)
                    )
                    .padding(horizontal = AppDsTheme.spacing.sm),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (leadingIcon != null) {
                    leadingIcon()
                    Spacer(Modifier.width(AppDsTheme.spacing.xs))
                }

                Box(modifier = Modifier.weight(1f)) {
                    if (value.isEmpty() && placeholder != null) {
                        placeholder()
                    }
                    innerTextField()
                }

                if (trailingIcon != null) {
                    Spacer(Modifier.width(AppDsTheme.spacing.xs))
                    trailingIcon()
                }
            }
        }
    )
}