package com.example.faceidentityui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.faceidentityui.ui.theme.FaceIdentityUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FaceIdentityUiTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}