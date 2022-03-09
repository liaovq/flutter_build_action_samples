package com.example.flutter_build_action_samples

import android.os.Bundle
import android.util.Log
import io.flutter.BuildConfig
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "env is debug: ${BuildConfig.DEBUG}")
        Log.d("MainActivity", "env is profile: ${BuildConfig.PROFILE}")
        Log.d("MainActivity", "env is release: ${BuildConfig.RELEASE}")
    }
}
