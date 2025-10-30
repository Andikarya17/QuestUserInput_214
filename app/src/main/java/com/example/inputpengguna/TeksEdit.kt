package com.example.inputpengguna

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormatDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateOf("") }
}