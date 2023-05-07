package com.example.submissioncomposerakha.ui.page

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.submissioncomposerakha.data.Raket
import com.example.submissioncomposerakha.ui.theme.SubmissionComposeRakhaTheme


@Composable
fun Detail(
    id: String,
    name: String,
    photoUrl: Int,
    desc: String,
    harga: String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(photoUrl),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(400.dp)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = name,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = harga,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = desc,
                color = Color.Black,
                textAlign = TextAlign.Justify,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                modifier = Modifier.padding(top = 16.dp, start = 10.dp, end = 10.dp)
            )
        }
    }
}

@Composable
fun RaketDetail(
    raket: Raket,
    modifier: Modifier = Modifier
) {
    Detail(
        id = raket.id,
        name = raket.name,
        photoUrl = raket.photoUrl,
        desc = raket.desc,
        harga = raket.harga,
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    SubmissionComposeRakhaTheme {
        Detail(
            id = "1",
            name = "Li-Ning XP 800",
            photoUrl = R.drawable.raket1,
            desc = "Raket ini menampilkan Ginting signature yang pastinya bisa menambah semangat Anda saat bermain, Harganya pun sangat murah sehingga menjadi salah satu produk yang banyak diminati.Meski begitu, spesifikasi raket ini cukup mumpuni untuk dipakai oleh anak sekolah atau untuk bermain santai. Kelebihannya Material terbuat dari aluminium sehingga lebih tahan banting. Kekurangannya Tidak cocok dipakai dalam pertandingan profesional karena bukan raket yang didesain untuk kompetisi",
            harga = "Rp277.276"
        )
    }
}