package com.yusubov.kanzadesignsystemdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.thisisyusub.kanzadesignsystem.AppDsTheme
import com.yusubov.composebook.ComposeBook
import com.yusubov.composebook.core.addons.defaults.ThemeOption
import com.yusubov.composebook.dsl.composeBookConfig
import com.yusubov.kanzadesignsystemdemo.components.appDsCardUseCase
import com.yusubov.kanzadesignsystemdemo.components.appDsCheckBoxUseCase
import com.yusubov.kanzadesignsystemdemo.components.appDsDividerUseCase
import com.yusubov.kanzadesignsystemdemo.components.appDsDropDownUseCase
import com.yusubov.kanzadesignsystemdemo.components.appDsIconUseCase
import com.yusubov.kanzadesignsystemdemo.components.appDsInputFieldUseCase
import com.yusubov.kanzadesignsystemdemo.components.appDsTextUseCase
import com.yusubov.kanzadesignsystemdemo.components.appDsToggleUseCase
import com.yusubov.kanzadesignsystemdemo.foundation.darkColorsUseCase
import com.yusubov.kanzadesignsystemdemo.foundation.lightColorsUseCase
import com.yusubov.kanzadesignsystemdemo.foundation.radiiUseCase
import com.yusubov.kanzadesignsystemdemo.foundation.sizesUseCase
import com.yusubov.kanzadesignsystemdemo.foundation.spacingUseCase
import com.yusubov.kanzadesignsystemdemo.foundation.typographyUseCase

@Composable
fun DemoApp() {
    ComposeBook(
        config = composeBookConfig {
            addons {
                viewportAddon()
                textScaleAddon()
                themeAddon(
                    themes = listOf(
                        ThemeOption("Light", data = false),
                        ThemeOption("Dark", data = true)
                    ),
                    builder = { isDarkTheme, content ->
                        AppDsTheme(
                            isDark = isDarkTheme,
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(AppDsTheme.colors.background),
                                contentAlignment = Alignment.Center,
                            ) {
                                content()
                            }
                        }
                    }
                )
            }

            directory("Foundation") {
                lightColorsUseCase()
                darkColorsUseCase()
                radiiUseCase()
                sizesUseCase()
                spacingUseCase()
                typographyUseCase()
            }

            directory("Components") {
                appDsCardUseCase()
                appDsCheckBoxUseCase()
                appDsDividerUseCase()
                appDsDropDownUseCase()
                appDsIconUseCase()
                appDsInputFieldUseCase()
                appDsTextUseCase()
                appDsToggleUseCase()
            }
        }
    )
}