package com.example.facialfeatures.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.facialfeatures.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UploadScreen(navController: NavController, onNavigateBack: () -> Unit) {
    val placeholderImages = listOf(
        R.drawable.face_placeholder1,
        R.drawable.face_placeholder2,
        R.drawable.face_placeholder3,
        R.drawable.face_placeholder4,
        R.drawable.face_placeholder5,
        R.drawable.face_placeholder6
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Upload Faces") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.Face, contentDescription = "Back")
                    }
                }
            )
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2), // Two columns
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(placeholderImages) { imageRes ->
                        PlaceholderImage(
                            imageRes = imageRes,
                            onClick = { navController.navigate("result") }
                        )
                    }
                }
            }
        }
    )
}

@Composable
fun PlaceholderImage(imageRes: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(150.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Placeholder Face",
            modifier = Modifier.fillMaxSize()
        )
    }
}
