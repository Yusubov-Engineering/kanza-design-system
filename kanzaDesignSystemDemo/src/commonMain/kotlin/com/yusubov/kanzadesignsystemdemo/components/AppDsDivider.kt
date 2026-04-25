package com.yusubov.kanzadesignsystemdemo.components

import com.thisisyusub.kanzadesignsystem.components.AppDsHorizontalDivider
import com.thisisyusub.kanzadesignsystem.components.AppDsVerticalDivider
import com.yusubov.composebook.dsl.DirectoryBuilder

internal fun DirectoryBuilder.appDsDividerUseCase() {
    directory("AppDsDivider") {
        useCase("AppDsVerticalDivider") {
            AppDsVerticalDivider()
        }

        useCase("AppDsHorizontalDivider") {
            AppDsHorizontalDivider()
        }
    }
}