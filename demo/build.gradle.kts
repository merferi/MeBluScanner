plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id("kotlin-kapt")
}

android {
    namespace = "com.meferi.scannerdemo"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.meferi.scannerdemo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1002
        versionName = "1.0.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    signingConfigs {
        create("release") {
            storeFile = file("demo.jks")
            storePassword = "android"
            keyAlias = "demo"
            keyPassword = "android"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
        debug {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
        dataBinding = true
    }
}


dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.startup:startup-runtime:1.1.1")

    implementation("androidx.activity:activity-ktx:1.7.2")
    implementation("androidx.fragment:fragment-ktx:1.6.1")

    //brv
    implementation("com.github.liangjingkanji:BRV:1.5.2")

    //utilcodex
    implementation("com.blankj:utilcodex:1.31.1")

    //zxing
    implementation("com.github.yuzhiqiang1993:zxing:2.2.9")

    implementation("com.github.getActivity:TitleBar:10.5")

    implementation("com.afollestad.material-dialogs:core:3.3.0")
    implementation("com.afollestad.material-dialogs:lifecycle:3.3.0")
    implementation("com.afollestad.material-dialogs:input:3.3.0")

}