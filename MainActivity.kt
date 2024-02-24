package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Article(
                        stringResource(R.string.titulo),
                        stringResource(R.string.parrafo1),
                        stringResource(R.string.parrafo2))
                }
            }
        }
    }
}



@Composable
fun Article(titulo: String, parrafo1: String, parrafo2: String, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
    ){
        Image(painter = painterResource(
            id =  R.drawable.bg_compose_background),
            contentDescription = "Header",
            contentScale = ContentScale.FillWidth
            )
        Text(
            text = titulo,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp,bottom = 16.dp, end = 16.dp)
            )
        Text(
            text = parrafo1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = parrafo2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp,bottom = 16.dp, end = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Article(
            stringResource(R.string.titulo),
            stringResource(R.string.parrafo1),
            stringResource(R.string.parrafo2)
        )
    }
}