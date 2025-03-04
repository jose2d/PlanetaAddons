plugins {
    id("java")
    kotlin("jvm") version ("1.9.22")
    id("fabric-loom") version("1.7-SNAPSHOT")
}

group = "git.jse.planetacorp.fabric"
version = "2.0.0"


repositories {
    mavenLocal()
    mavenCentral()
    maven(url = "https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
    maven("https://maven.impactdev.net/repository/development/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    minecraft("net.minecraft:minecraft:1.21.1")
    mappings("net.fabricmc:yarn:1.21.1+build.3:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.9")

    modImplementation("net.fabricmc.fabric-api:fabric-api:0.110.0+1.21.1")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.12.3+kotlin.2.0.21")
    modImplementation("com.cobblemon:fabric:1.6.0+1.21.1")

}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "21"
    }
}