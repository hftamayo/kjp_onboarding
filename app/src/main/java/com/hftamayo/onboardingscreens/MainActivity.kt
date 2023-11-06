package com.hftamayo.onboardingscreens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.hftamayo.onboardingscreens.ui.theme.OnBoardingScreensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainLayout()
         }
    }
}

@Composable
fun MainLayout() {
    val primaryColor = Color(26, 32, 53, 255)
    NewJetTheme() {
        Surface(
            color = MaterialTheme.colors.background
        ){
            Column(modifier = Modifier
                .background(color = primaryColor)
                .fillMaxSize()
            ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier
                        .fillMaxWidth()
                    ,
                ){
                    Image(painterResource(id = R.drawable.image),
                    contentDescription = "",
                    contentScale = ContentScale.FillWidth,
                    )
                }
                
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MainLayout()
}