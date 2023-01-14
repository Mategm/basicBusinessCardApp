package com.example.businesscard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard( modifier: Modifier = Modifier.background(Color.Black)) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val mainImage = painterResource(id = R.drawable.android_logo)
        Image(
            painter = mainImage,
            contentDescription = null,
            modifier = Modifier
                //.width(200.dp)
                .height(120.dp)
        )
        Text(
            text = stringResource(R.string.Name),
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.White
        )
        Text(
            text = stringResource(R.string.title),
            color = Color(0xFF3DDC84),
            modifier = Modifier.padding(top = 10.dp)
        )
    }
    Column(
        //horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .padding(bottom = 20.dp)
    ) {
        Divider(color = Color.DarkGray, thickness = 1.dp)
        Row(
            modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp)
        ) {
            val image = painterResource(id = R.drawable.ic_baseline_call_24)
            Icon(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(25.dp)
                    .padding(start = 50.dp, end = 20.dp),
                Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.phone_number),
                color = Color.White,
                //modifier = Modifier.weight(1f,false)
            )
        }
        Divider(color = Color.DarkGray, thickness = 1.dp)
        Row(
            modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp)
        ) {
            val image = painterResource(id = R.drawable.ic_baseline_share_24)
            Icon(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(25.dp)
                    .padding(start = 50.dp, end = 20.dp),
                Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.share),
                color = Color.White
            )
        }
        Divider(color = Color.DarkGray, thickness = 1.dp)
        Row(
            modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp)
        ) {
            val image = painterResource(id = R.drawable.ic_baseline_email_24)
            Icon(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(25.dp)
                    .padding(start = 50.dp, end = 20.dp),
                Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.email),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}