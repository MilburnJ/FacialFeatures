package com.example.facialfeatures.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.facialfeatures.R

// Italiana Font
val Italiana = FontFamily(
    Font(R.font.italiana_regular)
)

// Typography with Italiana
val Typography = Typography(
    headlineMedium = TextStyle(
        fontFamily = Italiana,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 18.sp
    )
)
