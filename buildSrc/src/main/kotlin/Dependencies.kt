object Dependencies {
    const val SPRING_CLOUD = "org.springframework.cloud:spring-cloud-dependencies:${DependencyVersions.SPRING_CLOUD_VERSION}"
    const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"
    const val WEBFLUX = "org.springframework.boot:spring-boot-starter-webflux"
    const val KOTLIN_JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin"
    const val COROUTINE_REACTOR_EXTENSION = "io.projectreactor.kotlin:reactor-kotlin-extensions"
    const val COROUTINE_JDK = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${DependencyVersions.COROUTINE_VERSION}"
    const val KOTLINX_COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${DependencyVersions.COROUTINE_VERSION}"
    const val COROUTINE_REACTOR = "org.jetbrains.kotlinx:kotlinx-coroutines-reactor"
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${DependencyVersions.COROUTINE_VERSION}"
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${DependencyVersions.COROUTINE_VERSION}"
    const val SPRING_BOOT_TEST = "org.springframework.boot:spring-boot-starter-test"
    const val ACTUATOR = "org.springframework.boot:spring-boot-starter-actuator"
    const val REACTIVE_MYSQL = "dev.miku:r2dbc-mysql:${DependencyVersions.REACTIVE_MYSQL_VERSION}"
    const val R2DBC = "org.springframework.boot:spring-boot-starter-data-r2dbc"
    const val H2 = "io.r2dbc:r2dbc-h2:${DependencyVersions.H2_VERSION}"
    const val CONFIGURATION_PROCESSOR = "org.springframework.boot:spring-boot-configuration-processor"
    const val KTLINT = "com.pinterest:ktlint:${DependencyVersions.KTLINT_VERSION}"
    const val MICROMETER = "io.micrometer:micrometer-registry-prometheus"
    const val COROUTINE_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${DependencyVersions.COROUTINE_VERSION}"
    const val MAPSTRUCT = "org.mapstruct:mapstruct:${DependencyVersions.MAPSTRUCT_VERSION}"
    const val MAPSTRUCT_APT = "org.mapstruct:mapstruct-processor:${DependencyVersions.MAPSTRUCT_VERSION}"
    const val OPEN_API_UI = "org.springdoc:springdoc-openapi-webflux-ui:${DependencyVersions.OPEN_API_VERSION}"
    const val OPEN_API_CORE = "org.springdoc:springdoc-openapi-webflux-core:${DependencyVersions.OPEN_API_VERSION}"
    const val CLOUD_CONFIG = "org.springframework.cloud:spring-cloud-config-client"
}
