plugins {
    id("java")
    id("java-library")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":service"))
    implementation(project(":service"))
}