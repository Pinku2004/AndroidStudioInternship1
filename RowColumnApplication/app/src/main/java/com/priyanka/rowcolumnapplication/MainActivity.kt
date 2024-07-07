package com.priyanka.rowcolumnapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.priyanka.rowcolumnapplication.ui.theme.RowColumnApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColumnApplicationTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.padding(10.dp).background(Color.Blue)) {
            Column(modifier = Modifier.padding(16.dp).background(Color.White)) {
                Text(
                    text = "Header",
                    color = Color.Black,
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom= 16.dp),
                    textAlign = TextAlign.Center


                )
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 3.dp),
                    thickness = 2.dp,
                    color = Color.DarkGray
                )
                Row(
                    modifier = Modifier.fillMaxWidth().background(Color.Cyan),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.weight(1f).background(Color.Yellow)) {
                        Text(
                            text = "Column 1, Row 1",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(bottom= 8.dp)
                        )
                        Text(
                            text = "Column 1, Row 2",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(bottom= 8.dp)
                        )
                    }
                    Column(modifier = Modifier.weight(1f).background(Color.Green)) {
                        Text(
                            text = "Column 2, Row 1",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier.padding(bottom= 8.dp)
                        )
                        Text(
                            text = "Column 2, Row 2",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier.padding(bottom= 8.dp)
                        )
                    }
                }
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 3.dp),
                    thickness = 2.dp,
                    color = Color.DarkGray
                )

                Row(
                    modifier = Modifier.fillMaxWidth().background(Color.Cyan),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Row 2, Col 1",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Row 2, Col 2",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(8.dp)
                    )
                }
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 3.dp),
                    thickness = 2.dp,
                    color = Color.DarkGray
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewMainContent() {
     RowColumnApplicationTheme{
        MainContent()
    }
}