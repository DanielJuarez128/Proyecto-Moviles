package com.delgadojuarez.ucamarket.ui.screens

import android.util.Log
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.delgadojuarez.ucamarket.R
import com.delgadojuarez.ucamarket.ui.theme.azul
import com.delgadojuarez.ucamarket.ui.theme.grisTexto

@Composable
fun LoginScreen(){
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(70.dp))

        Image(painter = painterResource(id = R.drawable.buho), contentDescription = "Imagen iniciar sesion",
            modifier = Modifier.size(200.dp))

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Iniciar sesión", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))


        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Correo electrónico")
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Contraseña")
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = {
            Log.i("Credential","Email : $email Password : $password")
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = azul),
            elevation = ButtonDefaults.buttonElevation(5.dp)
        ) {
            Text(text = "Iniciar sesión")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "¿Olvidaste tu contraseña?",
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.clickable {
            // Acción al hacer clic en "¿Olvidaste tu contraseña?"
        })

        Spacer(modifier = Modifier.height(140.dp))// Espacio antes de los textos

        Row(
            modifier = Modifier.fillMaxWidth(), // Ocupa todo el ancho disponible
            horizontalArrangement = Arrangement.Center // Centra los elementos horizontalmente
        ) {
            Text(
                text = "¿No tienes cuenta?",
                fontWeight = FontWeight.Bold,
                color = grisTexto
            )
            Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los textos
            Text(
                text = "Regístrate",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.clickable {
                // Acción al hacer clic en "Regístrate"
            })
    }

    }
}

