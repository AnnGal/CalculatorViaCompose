package an.gal.android.calculatorviacompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import an.gal.android.calculatorviacompose.ui.theme.CalculatorViaComposeTheme
import androidx.compose.foundation.layout.Column

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorViaComposeTheme {
                // A surface container using the 'background' color from the theme
               /* Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }*/
            }
        }
    }
}

/*
@Composable
fun Greeting(name: String) {
    Column() {
        Text(text = "Hello $name!")
        Text(text = "Hello Everyone!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorViaComposeTheme {
        Greeting("Android")
    }
}*/
