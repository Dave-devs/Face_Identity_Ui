package com.example.faceidentityui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.faceidentityui.ui.theme.FaceIdentityUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FaceIdentityUiTheme {
                // A surface container using the 'background' color from the theme
                FaceID()
            }
        }
    }
}

@Composable
fun FaceID(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.face_id_icon),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier.size(100.dp),
                colorFilter = ColorFilter.tint(Color.White)
            )
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Face ID for payment",
                modifier = Modifier,
                fontWeight = FontWeight.Medium,
                fontSize = 25.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Use Face ID to unlock.",
                modifier = Modifier,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(250.dp))
            Button()
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

@Composable
fun Button(modifier: Modifier = Modifier) {
    Column(modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        androidx.compose.material3.Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(start = 25.dp, end = 25.dp),
            shape = CutCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            elevation = ButtonDefaults.buttonElevation(3.dp)
        ) {
            Text(
                text = "START SCAN",
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}


@Composable
@Preview(showBackground = true)
fun FaceIDPreview() {
    FaceIdentityUiTheme {
        FaceID()
    }
}
