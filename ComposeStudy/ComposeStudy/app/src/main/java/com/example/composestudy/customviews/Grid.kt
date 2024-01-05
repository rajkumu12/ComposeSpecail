package com.example.composestudy.customviews

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composestudy.R
import com.example.composestudy.models.GridModal
import ir.kaaveh.sdpcompose.sdp

// on below line we are creating grid view function for loading our grid view.
@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun gridView(context: Context) {
    // on below line we are creating and initializing our array list
    lateinit var courseList: List<GridModal>
    courseList = ArrayList<GridModal>()

    // on below line we are adding data to our list.
    courseList = courseList + GridModal("Android", R.drawable.cpu)
    courseList = courseList + GridModal("JavaScript", R.drawable.cpu)
    courseList = courseList + GridModal("Python", R.drawable.cpu)
    courseList = courseList + GridModal("C++", R.drawable.cpu)
    courseList = courseList + GridModal("C#", R.drawable.cpu)
    courseList = courseList + GridModal("Java", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)
    courseList = courseList + GridModal("Node Js", R.drawable.cpu)

    // on below line we are adding lazy
    // vertical grid for creating a grid view.
    LazyVerticalGrid(
        // on below line we are setting the
        // column count for our grid view.
        columns = GridCells.Fixed(3),
        // on below line we are adding padding
        // from all sides to our grid view.
        modifier = Modifier.padding(10.dp)
    ) {
        // on below line we are displaying our
        // items upto the size of the list.
        items(courseList.size) {
            // on below line we are creating a
            // card for each item of our grid view.
            Card(
                // inside our grid view on below line we are
                // adding on click for each item of our grid view.
                onClick = {
                    // inside on click we are displaying the toast message.
                    Toast.makeText(
                        context,
                        courseList[it].languageName + " selected..",
                        Toast.LENGTH_SHORT
                    ).show()
                },

                // on below line we are adding padding from our all sides.
                modifier = Modifier.padding(8.sdp),
                shape = RoundedCornerShape(8.sdp),

                // on below line we are adding elevation for the card.
                elevation = 6.dp
            ) {
                // on below line we are creating a column on below sides.
                Column(
                    // on below line we are adding padding
                    // padding for our column and filling the max size.
                    Modifier
                        .fillMaxSize()
                        .padding(5.dp),

                    // on below line we are adding
                    // horizontal alignment for our column
                    horizontalAlignment = Alignment.CenterHorizontally,

                    // on below line we are adding
                    // vertical arrangement for our column
                    verticalArrangement = Arrangement.Center
                ) {
                    // on below line we are creating image for our grid view item.
                    Image(
                        // on below line we are specifying the drawable image for our image.
                        painter = painterResource(id = courseList[it].languageImg),

                        // on below line we are specifying
                        // content description for our image
                        contentDescription = "Javascript",

                        // on below line we are setting height
                        // and width for our image.
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                            .padding(5.dp)
                    )

                    // on the below line we are adding a spacer.
                    Spacer(modifier = Modifier.height(9.dp))

                    // on below line we are creating
                    // a text for our grid view item
                    Text(
                        // inside the text on below line we are
                        // setting text as the language name
                        // from our modal class.
                        text = courseList[it].languageName,

                        // on below line we are adding padding
                        // for our text from all sides.
                        modifier = Modifier.padding(4.dp),

                        // on below line we are
                        // adding color for our text
                        color = Color.Black
                    )
                }
            }
        }
    }
}