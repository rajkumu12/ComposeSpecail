package com.example.composestudy.customviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ir.kaaveh.sdpcompose.sdp

@Composable
fun Icon(name: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = name),
        contentDescription = null,
        modifier = Modifier
            .size(80.sdp)
            .clip(RoundedCornerShape(4.sdp))

    )
}