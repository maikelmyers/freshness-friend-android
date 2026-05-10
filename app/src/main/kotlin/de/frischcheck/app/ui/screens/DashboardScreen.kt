package de.frischcheck.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Inventory", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Scanner öffnen */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Scan Barcode")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(5) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text("Product $index", style = androidx.compose.material3.MaterialTheme.typography.bodyLarge)
                            Text("Expiry: 2026-12-31", style = androidx.compose.material3.MaterialTheme.typography.bodySmall)
                        }
                        Text("Good")
                    }
                }
            }
        }
    }
}
