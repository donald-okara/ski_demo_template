import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.donald_okara.demo.HelloSki

@Preview
@Composable
fun PreviewAnimatedHelloWorld() {
    MaterialTheme {
        Surface {
            HelloSki()
        }
    }
}
