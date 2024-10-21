plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    // O plugin do Google Services deve ser aplicado apenas uma vez no final
}

android {
    namespace = "com.example.espacocultural"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.espacocultural"
        minSdk = 32
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Escolha uma das bibliotecas:
    implementation 'com.google.firebase:firebase-database-ktx:20.3.0' // Para Realtime Database
    // implementation 'com.google.firebase:firebase-firestore-ktx:24.4.0' // Para Firestore

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

// Plugin do Google Services deve ser aplicado aqui, após as dependências
apply(plugin: 'com.google.gms.google-services')
