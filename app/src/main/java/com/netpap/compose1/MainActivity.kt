package com.netpap.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.netpap.compose1.ui.theme.Compose1Theme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           ProfileScreen()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Red) {
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose1Theme {
        Greeting("Android")
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    var isClicked by remember {
        mutableStateOf(false)
    }
    
    androidx.compose.material.Surface() {
        
    }
}