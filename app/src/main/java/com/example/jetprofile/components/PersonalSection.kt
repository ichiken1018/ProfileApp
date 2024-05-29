package com.example.jetprofile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.R

@Composable
fun PersonalSection(){
    //画像
    Image(
        painter = painterResource(id = R.drawable.img_profile),
        contentDescription = "プロフィール画像",
        modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(10.dp))
    )
    Spacer(modifier = Modifier.height(20.dp))
    //名前
    Text(
        text = "山田　太郎",
        color = Color.Gray,
        fontSize = 16.sp,
        fontWeight = FontWeight.ExtraBold,
    )
    Spacer(modifier = Modifier.height(20.dp))
    //職業
    Text(
        text = "職業",
        color = Color.Gray,
        fontSize = 16.sp,
    )
}