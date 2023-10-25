package com.example.drscet

import android.app.Activity
import android.content.Intent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.drscet.ui.theme.DrScetTheme

//import androidx.navigation.compose.rememberNavController



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.)

        setContent {
            var showSecondScreen by remember { mutableStateOf(false) }

            DrScetTheme {
               Column(modifier = Modifier
                   .fillMaxSize()
                   .padding(0.dp)
                   .verticalScroll(rememberScrollState())
                   .background(color = Color.Cyan),
                   horizontalAlignment = Alignment.CenterHorizontally)
                    {
                   Column(modifier = Modifier
                       .width(200.dp)
                       .height(200.dp)
                       .background(color = Color.Green.copy(alpha = 0.3f))
                       .padding(top = 20.dp, start = 25.dp))
                   {
//
//                       Text("Latest News", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
//                       Row(modifier = Modifier
//                           .fillMaxHeight()
//                           .horizontalScroll(rememberScrollState())) {
//                           // text for row
//                           // LAZY ROW IS A BETTER SOLUTION
//                           // find a way to break lines in compose instead of newline
//                           // padding is possibility - modifier to display - spacer
//                           LatestNewsItem(
//                               time = "25 MIN. AGO",
//                               title = "Venstre holder pressemaede om \npartiets 'situationø klokken 10"
//                           )
//                           Spacer(modifier = Modifier.width(10.dp))
//                           LatestNewsItem(
//                               time = "25 MIN. AGO",
//                               title = "Venstre holder pressemaede om \npartiets 'situationø klokken 10"
//                           )
//                           Spacer(modifier = Modifier.width(10.dp))
//                           LatestNewsItem(
//                               time = "25 MIN. AGO",
//                               title = "Venstre holder pressemaede om \npartiets 'situationø klokken 10"
//                           )
//                           Spacer(modifier = Modifier.width(16.dp))
//                       }
                   }
                        Spacer(modifier = Modifier.height(6.dp))

                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                Button(
                                    onClick = {
                                       val intent = Intent(this@MainActivity, MainActivity2::class.java)
                                       startActivity(intent);
                                       showSecondScreen = true
                                    },
                                    modifier = Modifier.padding(8.dp)
                                ) {
                                    Text(text = "Go to Second Screen")
                                }

                                if (showSecondScreen) {
                                    GreetingPreview2()

                                }

                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {

                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                StockItem(
                                    name = "Callum",
                                    difference = "22%"
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                StockItem(
                                    name = "Callum",
                                    difference = "22%"
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                StockItem(
                                    name = "Callum",
                                    difference = "22%"
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                StockItem(
                                    name = "Callum",
                                    difference = "22%"
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                StockItem(
                                    name = "Callum",
                                    difference = "22%"
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                StockItem(
                                    name = "Callum",
                                    difference = "22%"
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Box(
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(65.dp)
                                    .background(color = Color.Red.copy(alpha = 0.8f))
                                    .padding(top = 20.dp, start = 25.dp)
                            )
                            {
                                StockItem(
                                    name = "Callum",
                                    difference = "22%"
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))

//                        Box(modifier = Modifier
//                            .fillMaxWidth()
//                            .height(20.dp)
//                            .padding(start = 0.dp, bottom = 0.dp)
//                            .background(color = Color.Red.copy(alpha = 0.8f)))
//                        {
//
//                        }

                    }

            }

        }

    }
}
@Composable
fun SecondScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Second Screen", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                onBack()
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Go back to Main Screen")
        }
    }
}

@Composable
fun LatestNewsItem(time: String, title: String) {
    Column {
        Text(text = time, style = TextStyle(fontSize = 12.sp), fontWeight = FontWeight.Bold, color = Color.Red)
        Text(text = title, style = TextStyle(fontSize = 12.sp), fontWeight = FontWeight.Bold)
    }
}

@Composable
fun StockItem(name: String, difference: String) {
    Column {
        Row {
            Text(text = name, style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(120.dp))
            Text(
                text = difference,
                style = TextStyle(fontSize = 20.sp),
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hlo $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DrScetTheme {
        Greeting("Ad")
    }
}