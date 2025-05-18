package com.example.dummymobpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.dummymobpro.ui.screen.MainScreen
import com.example.dummymobpro.ui.theme.DummyMobproTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DummyMobproTheme {
                MainScreen()
            }
        }
    }
}

