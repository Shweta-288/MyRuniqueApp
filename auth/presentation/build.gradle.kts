plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "me.shwetagoyal.auth.presentation"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}