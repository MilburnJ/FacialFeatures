package com.example.facialfeatures.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facialfeatures.R

@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                // Greeting Text
                Text(
                    text = "Hi XXXXXXXX",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 20.sp),
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.Start)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Scan or Upload Button
                Button(
                    onClick = { /* No functionality yet */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5F5F5))
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Scan or upload",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.weight(1f)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = "Camera Icon",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Skin Type and Daily Check-In Section
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // Skin Type Button
                    Button(
                        onClick = { /* No functionality yet */ },
                        modifier = Modifier
                            .weight(1f)
                            .height(80.dp)
                            .padding(end = 8.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(text = "Go to skin survey", textAlign = TextAlign.Center)
                    }

                    // Daily Check-In Button
                    Button(
                        onClick = { /* No functionality yet */ },
                        modifier = Modifier
                            .weight(1f)
                            .height(80.dp)
                            .padding(start = 8.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(text = "Log skin health", textAlign = TextAlign.Center)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Trending Products Section
                Text(
                    text = "Trending Products",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.Start)
                )

                LazyRow(
                    modifier = Modifier.padding(top = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(listOf(R.drawable.product1, R.drawable.product2, R.drawable.product3)) { product ->
                        Image(
                            painter = painterResource(id = product),
                            contentDescription = "Product Image",
                            modifier = Modifier
                                .size(80.dp)
                                .padding(8.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Explore More Section
                Text(
                    text = "Explore more",
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.Start)
                )

                LazyRow(
                    modifier = Modifier.padding(top = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(listOf(R.drawable.explore1, R.drawable.explore2, R.drawable.explore3)) { explore ->
                        Image(
                            painter = painterResource(id = explore),
                            contentDescription = "Explore Image",
                            modifier = Modifier
                                .size(80.dp)
                                .padding(8.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                // Bottom Navigation
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    listOf(
                        R.drawable.home to "Home",
                        R.drawable.profile to "Profile",
                        R.drawable.cart to "Cart",
                        R.drawable.camera to "Notifications",
                        R.drawable.search to "Search"
                    ).forEach { (icon, description) ->
                        IconButton(onClick = { /* No functionality yet */ }) {
                            Image(
                                painter = painterResource(id = icon),
                                contentDescription = description,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}
