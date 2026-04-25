plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
    wasmJs {
        browser {
            commonWebpackConfig { outputFileName = "kanza-design-system-demo.js" }
        }
        binaries.executable()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":appDesignSystem"))
            implementation(libs.compose.ui)
            implementation(libs.compose.foundation)
            implementation(libs.compose.runtime)
            implementation(libs.material.icons.extended)
            implementation(libs.composebook)
        }
    }
}