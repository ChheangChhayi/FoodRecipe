plugins {
    id 'com.android.application'
    id 'com.google.gms.google-services'
}

android {
    namespace 'kh.edu.rupp.ite.iteapp.'
    compileSdk 33

    defaultConfig {
        applicationId "kh.edu.rupp.ite.iteapp."
        minSdk 21
        targetSdk 33
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }

    // ViewBinding
    buildFeatures {
        viewBinding true
    }
}

dependencies {

    // Pro Tip: Whenever you face duplicate class error, try to exclude the module from the dependency or update the dependency to the latest version.

    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.8.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.navigation:navigation-fragment:2.5.3'
    implementation 'androidx.navigation:navigation-ui:2.5.3'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'

    // Firebase
    implementation platform('com.google.firebase:firebase-bom:31.5.0')
    implementation 'com.google.firebase:firebase-analytics'
    implementation 'com.google.firebase:firebase-auth'
    implementation 'com.google.firebase:firebase-database'
    implementation 'com.google.firebase:firebase-storage'
    //Circle Image View
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    //Glide
    implementation 'com.github.bumptech.glide:glide:4.15.1'
    // Image Picker
    implementation 'com.github.jrvansuita:PickImage:+' // 2.4.0

    // Room Database
    implementation 'androidx.room:room-runtime:2.5.1'
    annotationProcessor 'androidx.room:room-compiler:2.5.1'
}