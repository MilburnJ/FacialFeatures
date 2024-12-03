package com.example.facialfeatures.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Face

@Composable
fun ScanUploadScreen(
    onNavigateToUpload: () -> Unit,
    onNavigateToScan: () -> Unit
) {
    Scaffold(
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Upload Button
                Button(
                    onClick = onNavigateToUpload,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5F5F5))
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Upload Icon",
                            modifier = Modifier.size(24.dp),
                            tint = Color.Black
                        )
                        Text(
                            text = "Upload",
                            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        )
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                // Horizontal Divider
                Divider(color = Color.Black, thickness = 1.dp)

                Spacer(modifier = Modifier.height(32.dp))

                // Scan Button
                Button(
                    onClick = onNavigateToScan,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5F5F5))
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.Face,
                            contentDescription = "Scan Icon",
                            modifier = Modifier.size(24.dp),
                            tint = Color.Black

                        )
                        Text(
                            text = "Scan",
                            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp),
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    )
}
