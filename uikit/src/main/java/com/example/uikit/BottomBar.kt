package com.example.uikit

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//28.04.2026
//11
//функция для отображения bottombar. Принимает модификатор и методы кликов по кнопкам
@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    onStatisticsClick: () -> Unit,
    onDiscoverClick: () -> Unit,
    onChatClick: () -> Unit,
    onProfileClick: () -> Unit,
    onCalendarClick: () -> Unit
) {
    val bottomNavigationHeight =
        WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
    val row1 = listOf(
        BottomIconsData(
            icon = R.drawable.statistics_icon,
            title = "Statistics",
            onCLick = {
                Log.i("click", "пользователь нажал на иконку статистики")
                onStatisticsClick()
            },
            paddingStart = 0
        ),
        BottomIconsData(
            icon = R.drawable.location_pin,
            title = "Discover",
            onCLick = {
                Log.i("click", "пользователь нажал на иконку discover")
                onDiscoverClick()
            },
            paddingStart = 26
        )
    )
    val row2 = listOf(
        BottomIconsData(
            icon = R.drawable.chat,
            title = "Chat",
            onCLick = {
                Log.i("click", "пользователь нажал на иконку chat")
                onChatClick()
            },
            paddingStart = 0
        ),
        BottomIconsData(
            icon = R.drawable.profile,
            title = "Profile",
            onCLick = {
                Log.i("click", "пользователь нажал на иконку profile")
                onProfileClick()
            },
            paddingStart = 38
        )
    )
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(110.dp + bottomNavigationHeight),
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(R.drawable.container_taskbar),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 15.dp)
                .border(
                    width = 5.dp,
                    color = Color.White,
                    shape = CircleShape
                )
                .size(56.dp)
                .clickable{
                    Log.i("click", "пользователь нажал на кнопку schedule")
                    onCalendarClick()
                },
            contentAlignment = Alignment.Center
        ){
            Icon(painter = painterResource(R.drawable.schedule),
                tint = Color.White,
                contentDescription = null)
        }
        Row(
            modifier = Modifier
                .padding(
                    top = 45.dp,
                    bottom = 20.dp + bottomNavigationHeight
                )
                .padding(horizontal = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                row1.forEach {
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(start = it.paddingStart.dp)
                            .clickable{
                                it.onCLick()
                            }) {
                        Icon(painter = painterResource(it.icon),
                            contentDescription = null,
                            tint = Color.White)
                        Text(text = it.title,
                            color = Color.White,
                            style = Theme.typography.caption2Regular,
                            fontWeight = FontWeight(400),
                            fontSize = 10.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier
                .width(56.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                row2.forEach {
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(start = it.paddingStart.dp)
                            .clickable{
                                it.onCLick()
                            }) {
                        Icon(painter = painterResource(it.icon),
                            contentDescription = null,
                            tint = Color.White)
                        Text(text = it.title,
                            color = Color.White,
                            style = Theme.typography.caption2Regular,
                            fontWeight = FontWeight(400),
                            fontSize = 10.sp
                        )
                    }
                }
            }
        }
    }
}

//класс данных иконок нижней навигации
data class BottomIconsData(
    val icon: Int,
    val title: String,
    val onCLick: () -> Unit,
    val paddingStart: Int
)