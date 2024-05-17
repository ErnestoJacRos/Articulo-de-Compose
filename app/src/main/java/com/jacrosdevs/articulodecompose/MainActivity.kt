package com.jacrosdevs.articulodecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jacrosdevs.articulodecompose.ui.theme.ArticuloDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticuloDeComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }
}

@Composable
fun ArticleText(
    title: String, parrafo1: String,
    parrafo2: String, modifier: Modifier = Modifier
) {
    Text(text = title,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp))
    Text(text = parrafo1,
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(start = 16.dp, end = 16.dp))
    Text(text = parrafo2,
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(16.dp))
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null
        )
        ArticleText(
            title = "Jetpack Compose tutorial",
            parrafo1 = stringResource(R.string.parrafo_uno_text) ,
            parrafo2 = stringResource(R.string.parrafo_dos_text) )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuloDeComposeTheme {
        Article()
    }
}