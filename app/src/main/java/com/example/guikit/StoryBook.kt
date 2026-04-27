package com.example.guikit

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.example.uikit.Input

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