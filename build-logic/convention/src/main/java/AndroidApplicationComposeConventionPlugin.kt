import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import me.shwetagoyal.convention.configureAndroidCompose

class AndroidApplicationComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
       target.run {
           pluginManager.run {
               apply("runique.android.application")
               apply("org.jetbrains.kotlin.plugin.compose")
           }

           val extension = extensions.getByType<ApplicationExtension>()
           configureAndroidCompose(extension)
       }
    }

}