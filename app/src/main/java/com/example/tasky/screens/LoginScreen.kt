package com.example.tasky.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasky.R
import com.example.tasky.ui.components.TextButton
import com.ramcosta.composedestinations.annotation.Destination

@Destination(start = true)
@Composable
fun LoginScreen(){
    Column(modifier =Modifier.fillMaxSize().background(Black)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .weight(.2f)
            ,
            contentAlignment = Alignment.TopCenter,
        ) {
            Column(modifier =  Modifier.align(
                Alignment.Center).padding(top = 20.dp)) {
                Text(
                    text = stringResource(R.string.welcome_back),
                    style = TextStyle(
                        fontSize = 28.sp,
                        lineHeight = 30.sp,
                        fontFamily = FontFamily(Font(R.font.inter_bold)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    )
                )
            }
        }
        Spacer(Modifier.padding(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd =  30.dp))
                .background(White)
                .weight(.8f)

                ,
            contentAlignment = Alignment.Center
        ){
            Column(Modifier.padding(horizontal = 12.dp).align(Alignment.TopCenter)) {
                Spacer(Modifier.padding(24.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {Text(stringResource(R.string.email_address))},
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        cursorColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                        focusedContainerColor =  Color(0xFFF2F3F7),
                        unfocusedContainerColor =  Color(0xFFF2F3F7),
                    ),
                    shape = RoundedCornerShape(percent = 50)

                )
                Spacer(Modifier.padding(8.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {Text(stringResource(R.string.password))},
                    trailingIcon = { Image(
                        painter = painterResource(id = R.drawable.baseline_visibility_off_24),
                        contentDescription = stringResource(id = R.string.hide_visibility)
                    ) },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        cursorColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                        focusedContainerColor =  Color(0xFFF2F3F7),
                        unfocusedContainerColor =  Color(0xFFF2F3F7),
                    ),
                    shape = RoundedCornerShape(percent = 50)
                )
                Spacer(Modifier.padding(16.dp))
                TextButton(stringResource(R.string.log_in).uppercase(), onClick = {})
            }
        }
    }

}