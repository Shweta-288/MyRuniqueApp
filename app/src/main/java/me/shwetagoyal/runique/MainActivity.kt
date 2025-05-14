package me.shwetagoyal.runique

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.shwetagoyal.auth.presentation.intro.IntroScreenRoot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntroScreenRoot(
                onSingInClick = { },
                onSignUpClick = { }
            )
        }
    }
}

