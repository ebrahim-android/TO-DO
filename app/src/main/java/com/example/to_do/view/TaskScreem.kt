package com.example.to_do.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    val taskList = listOf(
        "negocios",
        "gym",
        "escuela",
        "trabajo",
        "code"
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Theme()
        TaskDo(
            tasks = taskList
        )
    }
}

@Composable
fun Theme( //the theme of our app
    text: String = "My Tasks"
){
    Row(
        modifier = Modifier
            .fillMaxWidth()

    ) {
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
fun TaskDo( //show a list
    tasks: List<String>
){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
    ) {
        items(tasks) { taskName ->
            TaskItem(taskName = taskName)
        }
    }

}
@Composable
fun TaskItem(taskName: String) { //verified (so far)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 8.dp)
    ) {
        Text(text = "✅")
        Text(
            text = taskName,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

