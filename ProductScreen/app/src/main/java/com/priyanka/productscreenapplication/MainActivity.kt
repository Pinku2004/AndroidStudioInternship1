package com.priyanka.productscreenapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import com.priyanka.productscreenapplication.ViewModels.ProductViewModel
import com.priyanka.productscreenapplication.ViewModels.UserViewModel
import com.priyanka.productscreenapplication.Views.BottomBar
import com.priyanka.productscreenapplication.Views.ProductScreen
import com.priyanka.productscreenapplication.Views.UserScreen
import com.priyanka.productscreenapplication.ui.theme.ProductScreenApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            var value by remember { mutableFloatStateOf(0f) }
            var checked by remember { mutableStateOf(true) }
            val productVM: ProductViewModel by viewModels()
            val userVM: UserViewModel by viewModels()
            ProductScreenApplicationTheme{
                //UserScreen(userVm = userVM)
                Box(modifier = Modifier.fillMaxSize()) {
                    ProductScreen(productVM, Modifier.padding(bottom = 56.dp))
                    BottomBar(modifier = Modifier.align(Alignment.BottomCenter)
                    )
                }
            }
        }
        /*Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    productVM.fetchProducts()
                }) {
                    Text(text = "Click to make an API Call")
                }*/
    }
}
