package an.gal.android.calculatorviacompose

import an.gal.android.calculatorviacompose.ui.theme.CalculatorViaComposeTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorViaComposeTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp

                //Box
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
