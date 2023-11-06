package com.hftamayo.onboardingscreens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hftamayo.onboardingscreens.ui.theme.OnBoardingScreensTheme

class MainActivity : ComponentActivity() {
    val primaryColor = Color(26, 32, 53, 255)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainLayout()
         }
    }
}

@Composable
fun MainLayout() {
    NewJetTheme() {
        Surface(
            color = MaterialTheme.colors.background
        ){

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MainLayout()
}