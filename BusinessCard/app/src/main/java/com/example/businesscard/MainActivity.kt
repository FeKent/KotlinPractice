package com.example.businesscard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
<<<<<<< HEAD
                    Intro(
                        name = stringResource(R.string.name),
                        title = stringResource(R.string.title)
                    )
=======
                    Intro(name = stringResource(R.string.name), title = stringResource(R.string.title))
>>>>>>> 9f30d66af8f4fc5efb5a3d327fb380fad3466f44
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")

}

<<<<<<< HEAD

=======
>>>>>>> 9f30d66af8f4fc5efb5a3d327fb380fad3466f44
@Composable
fun Intro(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
<<<<<<< HEAD
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier.size(120.dp).padding(top = 20.dp, bottom = 50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.headshot),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
        Text(text = name)
        Text(text = title)
=======
            painter = painterResource(id = R.drawable.headshot),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(text = name,)
        Text(text = title,)
>>>>>>> 9f30d66af8f4fc5efb5a3d327fb380fad3466f44
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Intro(name = stringResource(R.string.name), title = stringResource(R.string.title))
    }
}