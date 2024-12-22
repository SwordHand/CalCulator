package com.shozhongjian.jisuanqi.ui.subassembly

import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SmallExample(value: String, onClick: () -> Unit) {
    val textone = value
    FloatingActionButton(
        onClick = { onClick() },
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.size(70.dp) // 设置按钮的大小，例如 64dp x 64dp
    ) {
        Text(

            text = textone,
            fontSize = 30.sp,
        )
    }
}

