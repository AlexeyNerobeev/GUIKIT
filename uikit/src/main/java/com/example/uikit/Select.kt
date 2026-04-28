package com.example.uikit

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//28.04.2026
//11
//функция отображения select. Принимает модификатор, метод клика, значение, заголовок
@Composable
fun Select(
    modifier: Modifier = Modifier,
    onCLick: () -> Unit,
    value: String,
    title: String
) {
    Column(modifier = modifier
        .clickable{
            Log.i("click", "пользователь нажал на select")
            onCLick()
        }) {
        Text(text = title,
            color = Color(0xFFFA5075),
            style = Theme.typography.caption2Regular,
            fontSize = 8.sp,
            fontWeight = FontWeight(400))
        Row(modifier = Modifier
            .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Text(text = value.ifEmpty { "MON, NOV 4,2019" },
                color = Color.Black,
                style = Theme.typography.caption2Regular,
                fontWeight = FontWeight(400),
                fontSize = 12.sp)
            Icon(painter = painterResource(R.drawable.dropdown),
                tint = Color.Unspecified,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 16.dp))
        }
    }
}