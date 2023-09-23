package com.codelab.state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.codelab.state.ui.theme.BasicStateCodelabTheme

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task #$i") }

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(item = task, checked = checked)
            },
            onCloseTask = { task -> wellnessViewModel.remove(task) })
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun WellnessScreenPreview() {
    BasicStateCodelabTheme { WellnessScreen() }
}