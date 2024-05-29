package com.example.jetprofile.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection(){
    //社名
    Text(
        text = "会社名",
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
    )
    Spacer(modifier = Modifier.height(10.dp))
    //部署
    Text(
        text = "Javaエンジニア",
        color = Color.Gray,
        fontSize = 16.sp,
    )
    Spacer(modifier = Modifier.height(20.dp))
    //Email
    Label(icon = Icons.Default.Email, text = "email")
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = "example@aaa.com",
        fontSize = 16.sp,
    )
    Spacer(modifier = Modifier.height(5.dp))

    Divider(
        modifier = Modifier.clip(
            RoundedCornerShape(1000.dp),
        )
    )

}