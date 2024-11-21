plugins {
    kotlin("jvm") version "2.0.21"
    id("io.github.tabilzad.ktor-docs-plugin-gradle") version "0.6.4-alpha"
}

group = "com.fyam"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.0.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

swagger {
    pluginOptions {
        format = "yaml"
        saveInBuild = false
    }
}
