package com.example.to_do.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TaskDetailScreen(
    taskName: String = "Tarea"
){
    Column(
        modifier  = Modifier
            .fillMaxSize()
    ){
        textTitle()

    }
    saveBotton()
}

@Composable
fun textTitle(
    text: String = "TITULO"
){
    Row{
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            textAlign = TextAlign.Center,
            fontSize = 54.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun saveBotton(
//    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        androidx.compose.material3.Button(
            onClick = { },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .fillMaxWidth()
        ) {
            Text(
                text = "SAVE TASK",
                fontSize = 20.sp,
            )
        }

    }
}