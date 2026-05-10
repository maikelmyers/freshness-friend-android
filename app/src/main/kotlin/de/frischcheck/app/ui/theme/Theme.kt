package de.frischcheck.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF6B5B95),
    secondary = Color(0xFF6B5B95),
    tertiary = Color(0xFFFF6B6B)
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF6B5B95),
    secondary = Color(0xFF6B5B95),
    tertiary = Color(0xFFFF6B6B)
)

@Composable
fun FreshnessFriendTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
