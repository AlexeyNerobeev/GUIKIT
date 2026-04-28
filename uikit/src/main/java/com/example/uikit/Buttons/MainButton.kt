package com.example.uikit.Buttons

import android.R
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uikit.Theme

//27.04.2026
//11
//функция отображения кнопки. Принимает текст, метод нажатия, модификатор
@Composable
fun MainButton(
    text: String,
    onCLick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {
            Log.i("click", "пользователь нажал на кнопку")
            onCLick()
        },
        modifier = modifier
            .height(58.dp)
            .widthIn(210.dp)
            .clip(RoundedCornerShape(100.dp))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFFFF6480),
                        Color(0xFFF22E63)
                    )
                ),
                shape = RoundedCornerShape(100.dp)
            ),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.White
        )
    ) {
        Text(
            text = text,
            color = Color.White,
            style = Theme.typography.captionRegular,
            fontSize = 14.sp,
            fontWeight = FontWeight(700)
        )
    }
}