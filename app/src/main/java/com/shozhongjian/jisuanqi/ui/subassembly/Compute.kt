package com.shozhongjian.jisuanqi.ui.subassembly

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.round


@Composable
fun ComputeArea(value: String = "0") {
    val fontSize = when {

        value.length > 14 -> 30.sp // 超过10个字符时减小字体
        value.length > 10 -> 40.sp // 超过5个字符时适中字体
        else -> 50.sp // 默认字体大小
    }


    Row(
        modifier = Modifier
            .fillMaxWidth()

            .padding(8.dp), // 添加内边距
        horizontalArrangement = Arrangement.End // 内容靠右对齐
    ) {
        Text(
            text = value, // 显示当前值
            fontSize = fontSize,
            fontWeight = FontWeight.Bold,

        )
    }
}
