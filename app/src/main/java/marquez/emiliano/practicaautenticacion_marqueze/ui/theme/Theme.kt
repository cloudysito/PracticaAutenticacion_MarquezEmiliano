package marquez.emiliano.practicaautenticacion_marqueze.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Black
)

@Composable
fun CursoFirebaseLiteTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}

@Composable
fun PracticaAutenticacionTheme(
    content: @Composable () -> Unit
) {
    CursoFirebaseLiteTheme(content = content)
}
