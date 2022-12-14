import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.surrus.common.di.initKoin
import com.surrus.common.remote.Assignment
import com.surrus.common.remote.PeopleInSpaceApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


private val koin = initKoin(enableNetworkLogs = true).koin

fun main() = application {
    val windowState = rememberWindowState()


    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "Sendergram"
    ) {

        Row(Modifier.fillMaxSize()) {

            Box(Modifier.width(250.dp).fillMaxHeight().background(color = Color.LightGray)) {
                Text(text = "List Items")
            }

            Spacer(modifier = Modifier.width(1.dp).fillMaxHeight())

            Box(Modifier.fillMaxHeight()) {
                Text(text = "Details item")
            }
        }

    }
}