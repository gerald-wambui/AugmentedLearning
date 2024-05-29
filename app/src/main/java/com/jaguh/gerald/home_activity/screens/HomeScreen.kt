package com.jaguh.gerald.home_activity.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaguh.gerald.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text ="VR SCHOLAR")},
                navigationIcon = {
                    IconButton(onClick = { Icons.Filled.Menu }) {
                        Icons.Outlined.Menu
                    }
                },
            )
        }
    ) { paddingValues ->  

        Box(modifier = Modifier.padding(paddingValues)){
            Column {
                Image(
                    painter = painterResource(id = R.drawable.vr_scholar),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "REVOLUTIONIZING EDUCATION\n")
                Text(
                    text = "LEARNING \n" +
                            "JUST GOT \n BETTER",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )

                Text(text = "VR and AR bring subjects to life in ways that textbooks and lectures cannot." +
                        " By immersing students in three-dimensional environments or augmenting their real world with digital information, Our system improves understanding and retention.")


            }
        }
    }
}