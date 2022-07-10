plugins {
    kotlin("multiplatform") version "1.7.10"
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
    "commonMainApi"("io.ktor:ktor-client-resources:2.0.3") {
        exclude("org.jetbrains.kotlinx", "kotlinx-serialization-core")
    }
    "commonMainApi"("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.3")
    "commonMainApi"("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
}
