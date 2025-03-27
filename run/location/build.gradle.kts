plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "me.shwetagoyal.run.location"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.run.domain)

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)
}