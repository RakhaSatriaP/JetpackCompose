package com.example.submissioncomposerakha.ui.page

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.submissioncomposerakha.data.Raket

@Composable
fun RaketListItem(
    raket: Raket,
    id: String,
    name: String,
    photoUrl: Int,
    harga: String,
    onClick: (Raket) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        backgroundColor = Color.Black,
        shape = RoundedCornerShape(10.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            .height(120.dp)
            .clickable { onClick(raket) }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .offset(x = 5.dp)

        ) {
            Image(
                painter = painterResource(photoUrl),
                contentDescription = "Gambar Raket",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Text(
                text = name,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(start = 10.dp)
            )
        }
    }
}

