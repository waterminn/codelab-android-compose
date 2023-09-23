package com.codelab.state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.state.ui.theme.BasicStateCodelabTheme

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task #$i") }

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        //    WaterCounter(modifier = modifier)
        StatefulCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        // or
//        val list = remember {
//            mutableStateListOf<WellnessTask>().apply { addAll(getWellnessTasks()) }
//        }
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun WellnessScreenPreview() {
    BasicStateCodelabTheme { WellnessScreen() }
}