package com.example.rma_tim1_projekat.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rma_tim1_projekat.R



@Composable
fun ThirdScreen(){
    val imagePainter: Painter = painterResource(id = R.drawable.caramel_frapuccino)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2B48C)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(350.dp)
                .background(Color(0xFF5D4037), shape = RoundedCornerShape(16.dp))
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Caramel Frapuccino",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp
            ),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "6$",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF5D4037)
            ),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Caramel Frappuccino je popularno hladno piće koje se sastoji od esencije kafe, mlijka, leda i slatkg sirupa karamele.",
            style = TextStyle(
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
            ),
        )
    }
}