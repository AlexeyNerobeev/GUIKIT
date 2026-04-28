package com.example.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//27/04/2026
//11
//функция отображения pagination. Принимает модификатор, текущий флаг
@Composable
fun Pagination(
    modifier: Modifier = Modifier,
    current: Int = 1
) {
    val boxList = listOf(1, 2, 3)
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        boxList.forEach {
            Box(
                modifier = Modifier
                    .size(10.dp)
                    .background(
                        color = if (it == current) Color(0xFFFA5075) else Color.LightGray,
                        shape = CircleShape
                    )
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}