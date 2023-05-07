import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.*
import com.example.submissioncomposerakha.R
import com.example.submissioncomposerakha.data.RaketsData
import com.example.submissioncomposerakha.ui.page.RaketDetail
import com.example.submissioncomposerakha.ui.page.RaketListItem
import java.util.*


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RaketApp(
    modifier: Modifier = Modifier,
    onAboutMeClick: () -> Unit,

) {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Rekomendasi Raket"
                        ,fontWeight = FontWeight.Bold
                        , color = Color.White)
                },
                actions = {
                    IconButton(onClick = { onAboutMeClick() }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_about_me),
                            contentDescription = "about_page",
                            tint = Color.White,
                        )
                    }
                },
                backgroundColor = Color.Blue,
            )
        },
        content = {
            NavHost(navController = navController, startDestination = "raket_list") {
                composable("raket_list") {
                    LazyColumn {
                        items(RaketsData.Rakets, key = { it.id }) { raket ->
                            RaketListItem(
                                raket = raket,
                                id = raket.id,
                                name = raket.name,
                                photoUrl = raket.photoUrl,
                                harga = raket.harga,
                                onClick = { selectedRaket ->
                                    navController.navigate(
                                        "raket_detail/${selectedRaket.id}"
                                    ) {
                                        launchSingleTop = true
                                    }
                                }
                            )
                        }
                    }
                }

                composable(
                    "raket_detail/{raketId}",
                    arguments = listOf(navArgument("raketId") { type = NavType.StringType })
                ) { backStackEntry ->
                    val raketId = backStackEntry.arguments?.getString("raketId")
                    val raket = RaketsData.Rakets.find { it.id == raketId }!!
                    RaketDetail(raket = raket)
                }
            }
        },
    )
}

