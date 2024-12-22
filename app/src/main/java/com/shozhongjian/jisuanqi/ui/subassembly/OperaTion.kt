package com.shozhongjian.jisuanqi.ui.subassembly

// 计算表达式的结果
fun calculateResult(expression: String): String {
    return try {
        // 使用正则表达式分割表达式，支持加法、减法和乘法
        val regex = "([0-9]+)([+\\-X])?([0-9]+)?".toRegex()
        var result = 0
        var currentOperation = '+'

        // 遍历所有匹配的部分
        regex.findAll(expression).forEach { matchResult ->
            val (number1, operation, number2) = matchResult.destructured
            val num1 = number1.toInt()
            val num2 = number2.toIntOrNull() ?: 0

            // 根据当前操作符进行计算
            when (currentOperation) {
                '+' -> result += num1
                '-' -> result -= num1
                'X' -> result *= num1
            }

            // 更新当前操作符
            currentOperation = operation.firstOrNull() ?: '+'
        }

        // 处理最后一个操作
        when (currentOperation) {
            '+' -> result += expression.split('+').last().toIntOrNull() ?: 0
            '-' -> result -= expression.split('-').last().toIntOrNull() ?: 0
            'X' -> result *= expression.split('X').last().toIntOrNull() ?: 0
        }

        result.toString()
    } catch (e: Exception) {
        "Error" // 如果计算出错，返回 "Error"
    }
}