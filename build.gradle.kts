plugins {
    kotlin("multiplatform") version "1.7.10"
    kotlin("native.cocoapods") version "1.7.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
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

    cocoapods {

        summary = "Useless but needs to have a value"
        homepage = "Useless but needs to have a value"

        ios.deploymentTarget = "10.0"

        pod("MaterialComponents/TextFields", "124.2.0")

    }

}
