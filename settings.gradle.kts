rootProject.name = "Replace-main"

pluginManagement {
    includeBuild("replace"){
        name = "convention"
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    versionCatalogs {
        create("wings") {
            from(files("gradle/wings.versions.toml"))
        }
    }
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
//        maven {
//            name = "aar"
//            setUrl(rootDir.toLocalRepoDirectory().path)
//        }
        google()
        mavenCentral()
    }
}
plugins {
    id("android.recipes.all_projects_apk_action")
}
//includeBuild("$rootPath/$name") {
//	dependencySubstitution {
//		substitute(module("$group:$name")).with(project(":"))
//	}
//}

replace{
    excludes(
        "app"
    )
}

include(":app")
include(":basic:helpers")
include(":feature:home")
include(":basic:uikit")
//include(":feature:media")
//include(":feature:profile")
include(":replace")
include(":kt")
