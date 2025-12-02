package com.example.to_do.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TaskScreem (
    modifier: Modifier = Modifier
        .fillMaxSize()
){
    theme()
}

@Composable
fun theme( //the theme of our app
    text: String = "My Tasks"
){
    Row(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            textAlign = TextAlign.Center,
            fontSize = 54.sp,
            fontWeight = FontWeight.Bold

        )
    }
}