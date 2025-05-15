package com.example.demo_sajdalikeapp_tawba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.demo_sajdalikeapp_tawba.ui.theme.DemosajdalikeapptawbaTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemosajdalikeapptawbaTheme {
                FirstUI()
            }
        }
    }
    @Composable
    fun FirstUI(){
        Button(onClick={

        }
        )
        {
            Text(text = "Click me")

        }
    }

}
