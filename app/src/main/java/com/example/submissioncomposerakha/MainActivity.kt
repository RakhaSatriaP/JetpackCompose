package com.example.submissioncomposerakha

import RaketApp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.submissioncomposerakha.ui.page.AboutMe
import com.example.submissioncomposerakha.ui.theme.SubmissionComposeRakhaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SubmissionComposeRakhaTheme {

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "raket_list") {
                    composable("raket_list") {
                        RaketApp(
                            modifier = Modifier.fillMaxSize(),
                            onAboutMeClick = { navController.navigate("about_me") },
                        )
                    }

                    composable("about_me") {
                        AboutMe(modifier = Modifier.fillMaxSize())
                    }
                }
            }
        }
    }
}



