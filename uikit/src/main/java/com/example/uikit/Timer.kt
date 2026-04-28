package com.example.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//27.04.2026
//11
//функция отобрадения таймера. Принимает модификатор, секунды, минуты
@Composable
fun Timer(
    modifier: Modifier = Modifier,
    seconds: Int,
    minutes: Int
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFF6480),
                        Color(0xFFF22E63)
                    )
                ),
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 7.dp,
                    bottom = 16.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Timer",
                color = Color.White,
                style = Theme.typography.caption2Regular,
                fontWeight = FontWeight(400),
                fontSize = 12.sp
            )
            Text(
                text = if (minutes < 10) {
                    "0$minutes:"
                } else {
                    "$minutes:"
                } + if (seconds < 10) {
                    "0$seconds"
                } else {
                    seconds.toString()
                },
                modifier = Modifier
                    .padding(top = 14.dp),
                color =
                    Color.White,
                fontWeight = FontWeight(700),
                style = Theme.typography.caption2Regular,
                fontSize = 30.sp
            )
        }
    }
}