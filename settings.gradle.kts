pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Runique"
include(":app")
include(":auth:data")
include(":auth:domain")
include(":auth:presentation")
include(":core:presentaion:designsystem")
include(":core:presentaion:ui")
include(":core:presentation:designsystem")
include(":core:presentation:ui")
include(":core:data")
include(":core:domain")
include(":core:database")
include(":run:data")
include(":run:domain")
include(":run:presentation")
include(":run:location")
include(":run:network")
