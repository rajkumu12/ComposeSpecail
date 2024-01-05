package com.example.composestudy.customviews


import android.provider.CalendarContract.Colors
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(label: String, username: MutableState<TextFieldValue>, inputType: KeyboardType,) {
    TextField(
        label = { Text(text = label) },
        value = username.value,
        keyboardOptions = KeyboardOptions(keyboardType = inputType),
        shape = RoundedCornerShape(8.dp),
        onValueChange = { username.value = it },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black
        )


    )

}