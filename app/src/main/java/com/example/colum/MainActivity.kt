package com.example.colum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.colum.ui.theme.ColumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyColum(name="Android", modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
//Para realizar una columna
@Composable
fun MyColum(name : String , modifier : Modifier = Modifier) {
    Column (modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween){
        Text("Ejemplo1", modifier = Modifier.background(Color.Green).fillMaxWidth().height(150.dp))
        Text("Ejemplo1", modifier = Modifier.background(Color.Green).fillMaxWidth().height(150.dp))
        Text("Ejemplo1", modifier = Modifier.background(Color.Green).fillMaxWidth().height(150.dp))
        Text("Ejemplo1", modifier = Modifier.background(Color.Green).fillMaxWidth().height(150.dp))

    }
}

@Preview(showBackground = true)
@Composable
fun MyColumPreview() {
    ColumTheme {
        MyColum("Android")
    }
}