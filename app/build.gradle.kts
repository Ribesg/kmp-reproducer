plugins {
    kotlin("multiplatform") version "1.7.10"
    kotlin("native.cocoapods") version "1.7.10"
    kotlin("plugin.serialization") version "1.7.10"
}

kotlin {

    ios()
    iosSimulatorArm64()

    sourceSets {

        val iosMain by getting
        val iosTest by getting
        val iosSimulatorArm64Main by getting
        val iosSimulatorArm64Test by getting

        iosSimulatorArm64Main.dependsOn(iosMain)
        iosSimulatorArm64Test.dependsOn(iosTest)

    }

}

dependencies {
    "commonMainImplementation"(project(":lib"))
}
