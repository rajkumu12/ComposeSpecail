package com.example.composestudy

import com.example.composestudy.customviews.MyText
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.composestudy.customviews.Icon
import com.example.composestudy.ui.theme.ComposeStudyTheme
import com.example.composestudy.utility.Utils.addDealsAndNext
import ir.kaaveh.sdpcompose.sdp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color.White,
                ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Icon(R.drawable.cpu,Modifier
                            .size(80.sdp)
                            .clip(RoundedCornerShape(4.sdp)))
                        MyText(name = "Deep Thought",R.font.roboto_medium,8,20)
                    }
                }
            }
        }
        addDealsAndNext(this@MainActivity)
    }
}



