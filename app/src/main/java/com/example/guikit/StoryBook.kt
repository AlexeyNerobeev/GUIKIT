package com.example.guikit

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.example.uikit.BottomBar
import com.example.uikit.Buttons.LogoutButton
import com.example.uikit.Buttons.MainButton
import com.example.uikit.CustomCard
import com.example.uikit.CustomCheckbox
import com.example.uikit.Input
import com.example.uikit.Pagination
import com.example.uikit.Timer

//27.04.2026
//11
//функции для отобрадения элементов uikit
@ShowkaseComposable
@Composable
fun showInput(){
    Input(
        modifier = Modifier,
        value = "value",
        onValueChange = {  },
        withTrailingIcon = false,
        placeholder = "placeholder"
    )
}

@ShowkaseComposable
@Composable
fun showInputPassword(){
    Input(
        modifier = Modifier,
        value = "value",
        onValueChange = {  },
        withTrailingIcon = true,
        placeholder = "placeholder"
    )
}

@ShowkaseComposable
@Composable
fun showMainButton(){
    MainButton(
        text = "text",
        onCLick = {  },
        modifier = Modifier
    )
}

@ShowkaseComposable
@Composable
fun showLogoutButton(){
    LogoutButton() { }
}

@ShowkaseComposable
@Composable
fun showPagination(){
    Pagination(
        modifier = Modifier,
        current = 1
    )
}

@ShowkaseComposable
@Composable
fun showTimer(){
    Timer(
        modifier = Modifier,
        seconds = 0,
        minutes = 0
    )
}

@ShowkaseComposable
@Composable
fun showCheckbox(){
    CustomCheckbox(
        checked = true
    )
}

@ShowkaseComposable
@Composable
fun showUncheckedCheckbox(){
    CustomCheckbox(
        checked = false
    )
}

@ShowkaseComposable
@Composable
fun showCard(){
    CustomCard(
        modifier = Modifier,
        title = "Schedule",
        text = "Easily schedule event/games\n" +
                "then find like minded players for battle. You up for it?",
        icon = R.drawable.card_icon
    ) { }
}

@ShowkaseComposable
@Composable
fun showBottomBar(){
    BottomBar(
        modifier = Modifier,
        onStatisticsClick = {  },
        onDiscoverClick = {  },
        onChatClick = {  },
        onProfileClick = {  }
    ) { }
}