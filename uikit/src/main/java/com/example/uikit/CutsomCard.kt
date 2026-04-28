package com.example.uikit

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//27.04.2026
//11
//функция отображения карточки. Принимает модификатор, заголовок, текст, иконку, метод клика
@Composable
fun CustomCard(
    modifier: Modifier = Modifier,
    title: String,
    text: String,
    icon: Int,
    onCLick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(169.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFF6480),
                        Color(0xFFF22E63)
                    )
                ),
                shape = RoundedCornerShape(10.dp)
            )
            .clickable{
                Log.i("click", "пользователь нажал на карточку")
                onCLick()
            }
    ) {
        Image(painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier
                .padding(end = 22.dp,
                    bottom = 19.dp)
                .align(Alignment.BottomEnd)
                .height(107.dp),
            contentScale = ContentScale.FillHeight)
        Column(modifier = Modifier
            .padding(top = 30.dp,
                start = 24.dp)
            .fillMaxWidth(0.6f)) {
            Text(text = title,
                color = Color.White,
                style = Theme.typography.caption2Regular,
                fontWeight = FontWeight(700),
                fontSize = 12.sp)
            Text(text = text,
                color = Color.White,
                style = Theme.typography.caption2Regular,
                fontSize =  10.sp,
                fontWeight = FontWeight(400),
                modifier = Modifier
                    .padding(top = 14.dp),
                maxLines = 4,
                overflow = TextOverflow.Ellipsis)
        }
        Icon(painter = painterResource(R.drawable.forward_arrow__2_),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier
                .padding(start = 24.dp,
                    bottom = 24.dp)
                .align(Alignment.BottomStart))
    }
}