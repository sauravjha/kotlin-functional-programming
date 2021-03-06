import org.jetbrains.kotlin.base.kapt3.KaptOptions
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Gradle plugin project to get you started.
 * For more details take a look at the Writing Custom Plugins chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.5/userguide/custom_plugins.html
 */
/*
apply plugin: 'kotlin-kapt'
def arrow_version = "0.9.0-SNAPSHOT"
*/
val arrowVersion by extra { "0.9.0" }
val spekVersion by extra { "2.0.12" }

plugins {
    // Apply the Java Gradle plugin development plugin to add support for developing Gradle plugins
    //`java-gradle-plugin`

    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.5.0"
    kotlin("kapt") version "1.5.0"
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
//    maven { url = uri("https://dl.bintray.com/arrow-kt/arrow-kt/") }
//    maven { url  = uri("https://oss.jfrog.org/artifactory/oss-snapshot-local/") }
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    implementation(arrow("typeclasses"))
    implementation(arrow("extras-data"))
    implementation(arrow("syntax"))
    implementation(arrow("extras-extensions"))
    implementation(arrow("core-extensions"))
    implementation(arrow("core-data"))

  /*  implementation(arrow("core-data"))
    implementation(arrow("core-extensions"))
    implementation(arrow("syntax"))
    implementation(arrow("typeclasses"))
    implementation(arrow("extras-data"))
    implementation(arrow("extras-extensions"))*/
    kapt(arrow("meta"))

    testImplementation("org.spekframework.spek2:spek-dsl-jvm:$spekVersion")
    testImplementation("org.spekframework.spek2:spek-runtime-jvm:$spekVersion")

    testImplementation("org.spekframework.spek2:spek-runner-junit5:$spekVersion")
    testImplementation("io.mockk:mockk:1.10.2")

    testImplementation("com.natpryce:hamkrest:1.4.2.0")

}

fun DependencyHandler.arrow(module: String): String =
    "io.arrow-kt:arrow-$module:$arrowVersion"

/*
gradlePlugin {
    // Define the plugin
    val greeting by plugins.creating {
        id = "example.greeting"
        implementationClass = "example.KotlinFunctionalProgrammingPlugin"
    }
}
*/

/*
// Add a source set for the functional test suite
val functionalTestSourceSet = sourceSets.create("functionalTest") {
}

gradlePlugin.testSourceSets(functionalTestSourceSet)
configurations.getByName("functionalTestImplementation").extendsFrom(configurations.getByName("testImplementation"))
*/

/*// Add a task to run the functional tests
val functionalTest by tasks.registering(Test::class) {
    testClassesDirs = functionalTestSourceSet.output.classesDirs
    classpath = functionalTestSourceSet.runtimeClasspath
}*/
/*

val check by tasks.getting(Task::class) {
    // Run the functional tests as part of `check`
    dependsOn(functionalTest)
}
*/

tasks {
    test {
        useJUnitPlatform {
            includeEngines("spek2")
        }
        testLogging.showExceptions = true
    }
}

application {
    // Define the main class for the application.
    mainClassName = "example.AppKt"
}