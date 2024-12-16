package com.example.facialfeatures.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
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
fun ResultScreen(navController: NavController) {
    val exploreImages = listOf(
        R.drawable.explore1,
        R.drawable.explore2,
        R.drawable.explore3
    )
    val productImages = listOf(
        R.drawable.product1,
        R.drawable.product2,
        R.drawable.product3
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Recommended Products") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.Home, contentDescription = "Back to Home")
                    }
                }
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Recommended Products Based on Your Face",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(16.dp)
                )

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    // Add Explore Images
                    items(exploreImages) { imageRes ->
                        PlaceholderImage(imageRes = imageRes)
                    }

                    // Add Product Images
                    items(productImages) { imageRes ->
                        PlaceholderImage(imageRes = imageRes)
                    }
                }

                // Checkout Button
                Button(
                    onClick = {
                        navController.navigate("home") { popUpTo("home") { inclusive = true } }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(56.dp)
                ) {
                    Text("Checkout")
                }
            }
        }
    )
}

@Composable
fun PlaceholderImage(imageRes: Int) {
    Box(
        modifier = Modifier
            .size(150.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Placeholder Image",
            modifier = Modifier.fillMaxSize()
        )
    }
}
