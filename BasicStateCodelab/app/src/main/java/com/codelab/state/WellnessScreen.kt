package com.codelab.state

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.state.ui.theme.BasicStateCodelabTheme

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier = modifier)
}

@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun WellnessScreenPreview() {
    BasicStateCodelabTheme { WellnessScreen() }
}