import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rma_tim1_projekat.R
import java.time.format.TextStyle


@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2B48C)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "The Coffee Bean",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                    ),
        )
        Image(
            painter = painterResource(id = R.drawable.coffebean),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 16.dp),
            contentScale = ContentScale.Fit
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Sign in",
                textAlign = TextAlign.Start,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                ),
            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "E-mail") },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Password") },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.fillMaxWidth()
            )
            Button(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Sign in")
            }
        }
    }
}