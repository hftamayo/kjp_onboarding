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
import androidx.compose.ui.unit.dp
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
    OnBoardingScreensTheme() {
        Surface(
            color = MaterialTheme.colorScheme.background,
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
                        .padding(top = 100.dp)
                    ,
                ){
                    Image(painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    contentScale = ContentScale.FillWidth,
                        alignment = Alignment.TopEnd,
                    )
                }
                Column (
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ){
                    Spacer(modifier = Modifier
                        .background(color = Color.White)
                        .height(3.dp)
                        .width(200.dp)
                        .padding(bottom = 20.dp)
                    )
                    Spacer(modifier = Modifier
                        .padding(bottom = 20.dp)
                    )
                    Spacer(modifier = Modifier
                        .background(color = Color.White)
                        .height(3.dp)
                        .width(240.dp)

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