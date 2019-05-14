import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "fr.neyb.armor7"
version = "1.0-SNAPSHOT"

tasks.withType<Wrapper> {
    gradleVersion = "5.4.1"
}

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.31"))
    }
}

subprojects {
    apply("org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    dependencies {
        "implementation"(kotlin("stdlib-jdk8"))

        "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.4.2")
        "testRuntime"("org.junit.jupiter:junit-jupiter-engine:5.4.2")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
