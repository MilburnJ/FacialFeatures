package com.example.facialfeatures.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SkinSurveyScreen(navController: NavController, onNavigateBack: () -> Unit) {
    // State variables for selected options
    var skinType by remember { mutableStateOf("") }
    var skinConcern by remember { mutableStateOf("") }
    var skincareRoutine by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Skin Survey", fontSize = 20.sp) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    // Question 1: Skin Type
                    Text(
                        text = "1. What is your skin type?",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    RadioGroup(
                        options = listOf("Oily", "Dry", "Combination", "Normal"),
                        selectedOption = skinType,
                        onOptionSelected = { skinType = it }
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    // Question 2: Skin Concerns
                    Text(
                        text = "2. What are your primary skin concerns?",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    RadioGroup(
                        options = listOf("Acne", "Aging", "Dark Spots", "Sensitivity"),
                        selectedOption = skinConcern,
                        onOptionSelected = { skinConcern = it }
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    // Question 3: Skincare Routine
                    Text(
                        text = "3. How often do you follow a skincare routine?",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    RadioGroup(
                        options = listOf("Daily", "Occasionally", "Rarely", "Never"),
                        selectedOption = skincareRoutine,
                        onOptionSelected = { skincareRoutine = it }
                    )
                }

                // Submit Button
                Button(
                    onClick = { navController.navigate("home") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                ) {
                    Text("Submit")
                }
            }
        }
    )
}

@Composable
fun RadioGroup(
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    Column {
        options.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                RadioButton(
                    selected = selectedOption == option,
                    onClick = { onOptionSelected(option) }
                )
                Text(
                    text = option,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}
