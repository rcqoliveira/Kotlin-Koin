import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "my-application"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.mockito:mockito-core:4.2.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("io.insert-koin:koin-core:3.1.5")
    implementation("org.mockito.kotlin:mockito-kotlin:4.0.0")
    implementation("org.mockito:mockito-junit-jupiter:4.2.0")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.6.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}