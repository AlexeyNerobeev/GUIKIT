package com.example.uikit

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

//27.04.2026
//11
//функция отображения checkbox. Принимает модификатор, флаг
@Composable
fun CustomCheckbox(
    modifier: Modifier = Modifier,
    checked: Boolean
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(3.dp))
            .border(color = Color(0xFFFA5075),
                shape = RoundedCornerShape(3.dp),
                width = 1.dp)
            .size(14.dp),
        contentAlignment = Alignment.Center
    ){
        if(checked){
            Icon(painter = painterResource(R.drawable.checkmark),
                contentDescription = null,
                tint = Color.Unspecified)
        }
    }
}