package com.example.businesscard

import android.graphics.Color.parseColor
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Intro(
                        name = stringResource(R.string.name),
                        title = stringResource(R.string.title)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")

}

@Composable
fun Intro(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                color = Color(parseColor("#073042"))
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            modifier = Modifier
                .size(120.dp)
                .padding(top = 20.dp, bottom = 50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.headshot),
            contentDescription = "Picture of a woman",
            contentScale = ContentScale.FillWidth
        )
        Text(text = name)
        Text(text = title)
        Row(modifier = Modifier.padding(top = 50.dp)) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = "Share Link Icon",
                modifier = Modifier.padding(end = 15.dp)
            )
            Text(text = "https://github.com/SnippyRex")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Intro(name = stringResource(R.string.name), title = stringResource(R.string.title))
    }
}