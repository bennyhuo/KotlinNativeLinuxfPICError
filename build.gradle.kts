plugins {
    kotlin("multiplatform") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    maven(url = "https://kotlin.bintray.com/kotlinx/")
    maven(url = "https://dl.bintray.com/korlibs/korlibs/")
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
                //api("org.jetbrains.kotlinx:kotlinx-datetime:0.1.0")
                api("com.soywiz.korlibs.korio:korio:1.11.13")

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