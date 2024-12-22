package com.shozhongjian.jisuanqi.ui.subassembly

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shozhongjian.jisuanqi.ui.theme.计算器Theme

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = modifier
                .fillMaxSize() // 让 Box 填满父容器
                .padding(8.dp) // 外边距
        ) {
            Column(
                modifier = modifier
                    .fillMaxSize() // 确保 Column 填满可用空间
                    .padding(bottom = 20.dp), // 设置底部边距
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom // 内容顶部对齐

            ) {


                ElevatedCardExample() // ElevatedCardExample 在下面
            }
        }
    }
}


@Preview(
    showBackground = true

)
@Composable
fun GreetingPreview() {
    计算器Theme {
        BottomBar(modifier = Modifier)


    }


}