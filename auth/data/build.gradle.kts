plugins {
    alias(libs.plugins.runique.android.library)
    alias(libs.plugins.runique.jvm.ktor)
}

android {
    namespace = "me.shwetagoyal.auth.data"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data)
}