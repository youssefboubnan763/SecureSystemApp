package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

// هذا اللون هو الأبيض المائل للرمادي الفاتح
val LightGrayBackground = Color(0xFFF5F5F5)

@Composable
fun HomeScreen() {
    // "Box" هو حاوية (Container) تمثل شاشة الهاتف
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGrayBackground), // هنا طبقنا اللون الذي طلبته
        contentAlignment = Alignment.Center
    ) {
        Text(text = "مرحباً بك في نظامك المحصن")
    }
}
