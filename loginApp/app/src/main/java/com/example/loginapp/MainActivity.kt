package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var UsuarioInput: EditText
    lateinit var ContraseñaInput: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        UsuarioInput= findViewById(R.id.Usuario_input)
        ContraseñaInput= findViewById(R.id.Contraseña_input)

        loginBtn= findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val Usuario = UsuarioInput.text.toString()
            val Contraseña = ContraseñaInput.text.toString()
            Log.i("Test Credencials", "Usuario : $Usuario and Contraseña : $Contraseña")

        }

        }
    }
