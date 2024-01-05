package com.example.composestudy.customviews

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun MyText(name: String,font: Int,padding:Int,fontdsize:Int) {
    Text(
        text = name,
        modifier = Modifier.padding(top = padding.sdp),
        fontFamily = FontFamily(Font(font)),
        style = TextStyle(fontSize = fontdsize.ssp)
    )
}

