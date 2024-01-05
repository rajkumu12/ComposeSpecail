package com.example.composestudy.uiScreens

import android.content.Intent
import com.example.composestudy.customviews.MyText
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.composestudy.R
import com.example.composestudy.customviews.MyTextField
import com.example.composestudy.ui.theme.ComposeStudyTheme
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

class LoginActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color.White,

                    ) {

                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val username = remember { mutableStateOf(TextFieldValue()) }
                    val password = remember { mutableStateOf(TextFieldValue()) }
                    MyText(name = "Login", font = R.font.roboto_medium, padding = 2, 30)
                    Spacer(modifier = Modifier.height(20.sdp))
                    MyTextField(label = "Username", username, KeyboardType.Text)
                    Spacer(modifier = Modifier.height(20.sdp))
                    MyTextField(label = "Password", password, KeyboardType.Password)
                    Spacer(modifier = Modifier.height(20.sdp))
                    Spacer(modifier = Modifier.height(20.sdp))
                    Box(modifier = Modifier.padding(40.sdp, 0.sdp, 40.sdp, 0.sdp)) {
                        Button(
                            onClick = {
                                val intent=Intent(this@LoginActivity,HomeActivity::class.java)
                                intent.putExtra("name",username.value.text)
                                startActivity(intent)
                            },
                            shape = RoundedCornerShape(18.sdp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(40.sdp)
                        ) {
                            Text(
                                text = "Login",
                                color = Color.White,
                                style = TextStyle(fontSize = 12.ssp)
                            )
                        }
                    }

                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeStudyTheme {
        Greeting("Android")
    }
}