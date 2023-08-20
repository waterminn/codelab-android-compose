package com.practice.basicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.practice.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                SuminApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
private fun SuminApp(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = modifier
    ) {
        Greeting(name = "Android")
    }
}

@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicsCodelabTheme {
        SuminApp()
    }
}