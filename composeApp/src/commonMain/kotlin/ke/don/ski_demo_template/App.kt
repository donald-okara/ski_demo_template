package ke.don.ski_demo_template

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.donald_okara.demo.HelloSki
import org.jetbrains.compose.resources.painterResource

import skidemotemplate.composeapp.generated.resources.Res
import skidemotemplate.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    val text = remember { getQueryParam("text") }

    MaterialTheme {
        HelloSki(text)
    }
}