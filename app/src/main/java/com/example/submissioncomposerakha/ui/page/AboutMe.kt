package com.example.submissioncomposerakha.ui.page

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.submissioncomposerakha.R
import com.example.submissioncomposerakha.ui.theme.SubmissionComposeRakhaTheme

@Composable
fun AboutMe(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(R.drawable.passfoto),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(500.dp)
                .padding(20.dp)
        )
        Text(
            text = "Rakha Satria Pratama",
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "rakhasatria@student.telkomuniversity.ac.id",
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AboutmePreview() {
    SubmissionComposeRakhaTheme {
        AboutMe()
    }
}

