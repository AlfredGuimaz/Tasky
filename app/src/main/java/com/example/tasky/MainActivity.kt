package com.example.tasky

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tasky.screens.NavGraphs
import com.example.tasky.ui.theme.TaskyTheme
import com.ramcosta.composedestinations.DestinationsNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskyTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}
