package com.example.uikit

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

//27.04.2026
//11
//функция отображения инпута. Принимает модификатор, занчение, метод изменения значения, флаг показа иконки,
//плейсхолдер
@Composable
fun Input(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    withTrailingIcon: Boolean = false,
    placeholder: String
) {
    val visible = remember { mutableStateOf(false) }
    BasicTextField(
        value = value,
        onValueChange = {
            Log.i("input", "пользователь ввел $it")
            onValueChange(it)
        },
        modifier = modifier,
        visualTransformation = if (visible.value) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        decorationBox = { innerTextField ->
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        if (value.isEmpty()) {
                            Text(
                                text = placeholder,
                                style = Theme.typography.caption2Regular,
                                color = Color.Black
                            )
                        }
                        innerTextField()
                    }
                    if (withTrailingIcon) {
                        Icon(
                            painter = painterResource(R.drawable.visible),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier
                                .padding(end = 6.dp)
                                .clickable {
                                    visible.value = !visible.value
                                })
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    Color(0xFFFF6480),
                                    Color(0xFFF22E63)
                                )
                            )
                        )
                )
            }
        }
    )
}