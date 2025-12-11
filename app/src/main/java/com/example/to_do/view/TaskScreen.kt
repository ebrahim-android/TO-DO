package com.example.to_do.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun TaskScreem(
    navigateOtherScreen: () -> Unit = {}
) {
    val taskList = listOf(
        "negocios",
        "gym",
        "escuela",
        "trabajo",
        "code"
    )

    Column (
        modifier = Modifier
            .fillMaxHeight()
    ){
        Theme()
//        Button()
        TaskDo(
            tasks = taskList
        )
//        Button()
    }
    AddButton(navigateOtherScreen = navigateOtherScreen)
}

@Composable
fun TaskDo(
    tasks: List<String>,
    onTaskClick: (String) -> Unit = {}
){
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {
        items(tasks) { taskName ->
            TaskItem(taskName = taskName,
                onClick = { onTaskClick(taskName)}
            )
        }
    }
}

@Composable
fun TaskItem(
    taskName: String,
    onClick: () -> Unit
) {
    var isChecked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp, horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
        Text(
            text = taskName,
            style = TextStyle(
                textDecoration = if (isChecked) TextDecoration.LineThrough else null
            ),
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}


@Composable
fun AddButton(
    navigateOtherScreen: () -> Unit 
){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        androidx.compose.material3.Button(
            onClick = { navigateOtherScreen() },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(20.dp)
        ) {
            Text(text = "+")
        }
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