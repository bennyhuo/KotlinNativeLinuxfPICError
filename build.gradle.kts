plugins {
    kotlin("multiplatform") version "1.4.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    maven(url = "https://kotlin.bintray.com/kotlinx/")
}

kotlin {
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */

    linuxX64 {
        binaries {
            sharedLib("test")
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                api("org.jetbrains.kotlinx:kotlinx-datetime:0.1.0")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}