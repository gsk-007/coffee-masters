package com.example.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeemasters.ui.theme.Alternative2

@Preview(showBackground = true, widthDp = 400)
@Composable
fun OffersPage() {
    Column(
        Modifier.verticalScroll(rememberScrollState())
    ) {
        Offer(title = "Early Coffee", description = "10% off. Offer valid from 6am to 9am.")
        Offer(title = "Welcome Gift", description = "25% off on your first order.")
        Offer(title = "Welcome Gift", description = "25% off on your first order.")
    }
}
@Composable
fun Offer(title:String, description:String) {
    Image(painter = painterResource(id = R.drawable.background_pattern),
        contentDescription ="Background pattern",
       contentScale =  ContentScale.FillWidth,
         modifier = Modifier
             .fillMaxWidth()
             .height(240.dp)

    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {

            Text(text = title,
                style = MaterialTheme.typography.h5,
                modifier = Modifier
                    .padding(16.dp)
                    .background(color = Alternative2)
                    .padding(16.dp)
            )
            Text(text = description,
            style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .padding(16.dp)
                    .background(color = Alternative2)
                    .padding(16.dp)
            )
    }
}