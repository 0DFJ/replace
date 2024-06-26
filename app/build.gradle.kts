plugins {
    alias(libs.plugins.android.application)
    alias(wings.plugins.compose)
}

android {
    namespace = "com.learn.replace"
}

dependencies {
    implementation(project(":feature:home"))
    implementation(replace(":feature:media"))
//    implementation(project(":feature:media"))
    implementation(replace(":feature:profile"))
//    implementation(replace(":feature:profile"))
}