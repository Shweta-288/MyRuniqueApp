plugins {
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "me.shwetagoyal.presentation.ui"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    debugImplementation(libs.androidx.ui.tooling)
    api(libs.androidx.material3)

    implementation(projects.core.domain)
    implementation(projects.core.presentation.designsystem)
}