package com.example.uikit.Buttons

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.uikit.R

//27.04.2026,
//11
//функция отображения кнопки выхода. Принимает модификатор, метод нажатия
@Composable
fun LogoutButton(
    modifier: Modifier = Modifier,
    onCLick: () -> Unit
) {
    Icon(painter = painterResource(R.drawable.tertiary_button),
        contentDescription = null,
        tint = Color.Unspecified,
        modifier = modifier
            .clickable{
                Log.i("click", "пользователь нажал на кнопку")
                onCLick()
            })
}