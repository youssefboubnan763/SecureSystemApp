package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

val LightGrayBackground = Color(0xFFF5F5F5)

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGrayBackground),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "مرحباً بك في نظامك المحصن")
    }
}
