package com.shozhongjian.jisuanqi.ui.subassembly

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ElevatedCardExample(modifier: Modifier = Modifier) {
    // 使用 remember 和 mutableStateOf 来创建状态变量
    val currentValue = remember { mutableStateOf("0") } // 状态变量，用于存储当前值
    var currentValues = remember { mutableStateOf("") }


    // 显示当前值

    ComputeArea(currentValue.value) // 将当前值传递给 ComputeArea
    ComputeArea(currentValues.value)


        ElevatedCard(
            modifier = Modifier
                .padding(8.dp) // 设置卡片内边距为 8dp
                .height(400.dp)
                .fillMaxWidth()


            )

         {
             Column(
                 modifier = Modifier.padding(10.dp),
                 horizontalAlignment = Alignment.CenterHorizontally
             ) {


                 Spacer(modifier = Modifier.height(16.dp)) // 添加间隔

                 // 第一行数字和操作按钮
                 Row(
                     horizontalArrangement = Arrangement.Center,
                     modifier = Modifier.fillMaxWidth()
                 ) {
                     SmallExample("1") {
                         currentValue.value = if (currentValue.value == "0") "1" else currentValue.value + "1"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("2") {
                         currentValue.value = if (currentValue.value == "0") "2" else currentValue.value + "2"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("3") {
                         currentValue.value = if (currentValue.value == "0") "3" else currentValue.value + "3"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("X") {
                         currentValue.value += "x"
                     }
                 }

                 Spacer(modifier = Modifier.height(16.dp)) // 添加间隔

                 // 第二行数字和等号按钮
                 Row(
                     horizontalArrangement = Arrangement.Center,
                     modifier = Modifier.fillMaxWidth()
                 ) {
                     SmallExample("4") {
                         currentValue.value = if (currentValue.value == "0") "4" else currentValue.value + "4"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("5") {
                         currentValue.value = if (currentValue.value == "0") "5" else currentValue.value + "5"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("6") {
                         currentValue.value = if (currentValue.value == "0") "6" else currentValue.value + "6"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("-") {
                         currentValue.value += "-"
                     }

                 }

                 Spacer(modifier = Modifier.height(16.dp)) // 添加间隔

                 // 第三行数字和清空按钮
                 Row(
                     horizontalArrangement = Arrangement.Center,
                     modifier = Modifier.fillMaxWidth()
                 ) {
                     SmallExample("7") {
                         currentValue.value = if (currentValue.value == "0") "7" else currentValue.value + "7"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("8") {
                         currentValue.value = if (currentValue.value == "0") "8" else currentValue.value + "8"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("9") {
                         currentValue.value = if (currentValue.value == "0") "9" else currentValue.value + "9"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("+") {
                         currentValue.value += "+"
                     }


                 }
                 Spacer(modifier = Modifier.height(16.dp)) // 添加间隔

                 // 第三行数字和清空按钮
                 Row(
                     horizontalArrangement = Arrangement.Center,
                     modifier = Modifier.fillMaxWidth()
                 ) {
                     SmallExample("0") {
                         currentValue.value = if (currentValue.value < "0") "0" else currentValue.value + "0"
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample(".") {
                         currentValue.value = if (currentValue.value < "0") "." else currentValue.value + "."
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("=") {
                         currentValue.value += "="
                         currentValues.value = calculateResult(currentValue.value)
                     }
                     Spacer(modifier = Modifier.width(16.dp)) // 添加间隔
                     SmallExample("清空") {
                         currentValue.value = "0"
                     }

                 }
             }
         }
}