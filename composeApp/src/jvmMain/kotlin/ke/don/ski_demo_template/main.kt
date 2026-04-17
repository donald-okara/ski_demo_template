package ke.don.ski_demo_template

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Skidemotemplate",
    ) {
        App()
    }
}