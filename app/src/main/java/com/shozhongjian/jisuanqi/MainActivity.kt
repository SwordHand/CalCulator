package com.shozhongjian.jisuanqi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shozhongjian.jisuanqi.hareward.HideNavigation
import com.shozhongjian.jisuanqi.ui.subassembly.BottomBar
import com.shozhongjian.jisuanqi.ui.subassembly.ElevatedCardExample
import com.shozhongjian.jisuanqi.ui.theme.计算器Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 调用 HideNavigation 的透明导航栏方法
        HideNavigation.transparentNavigationBar(window)
        enableEdgeToEdge()
        setContent {
            计算器Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    BottomBar(modifier = Modifier) // 传递 Modifier

                }
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