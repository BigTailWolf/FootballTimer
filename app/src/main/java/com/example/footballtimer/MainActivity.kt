import androidx.compose.ui.unit.dp
import androidx.activity.compose.setContent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.footballtimer.ui.PlayClock

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                color = Color(0xFF101010),
                modifier = Modifier.fillMaxSize()
            ) {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    // call the function Timer
                    // and pass the values
                    // it is defined below.
                    PlayClock(
                        totalTime = 40L * 1000L,
                        inactiveBarColor = Color.DarkGray,
                        modifier = Modifier.size(200.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        // call the function Timer
        // and pass the values
        // it is defined below.
        PlayClock(
            totalTime = 40L * 1000L,
            inactiveBarColor = Color.DarkGray,
            modifier = Modifier.size(200.dp)
        )
    }
}