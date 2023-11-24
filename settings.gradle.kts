pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl("https://maven.aliyun.com/repository/central") }
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { setUrl("https://s01.oss.sonatype.org/content/groups/public") }

        maven { setUrl("https://jitpack.io") }

        google()
        google {
            isAllowInsecureProtocol = true
        }
        mavenCentral()
        mavenCentral {
            isAllowInsecureProtocol = true
        }
    }
}

rootProject.name = "MeBluScanner"
include(":demo")
