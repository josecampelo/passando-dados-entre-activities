package com.campelo.passandodadosentreactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var edtNome: EditText
    private lateinit var edtPeso: EditText
    private lateinit var edtAltura: EditText
    private lateinit var btnCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNome = findViewById(R.id.edtNome)
        edtPeso = findViewById(R.id.edtPeso)
        edtAltura = findViewById(R.id.edtAltura)
        btnCadastrar = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            intent.putExtra("nome", edtNome.text.toString())
            intent.putExtra("peso", edtPeso.text.toString())
            intent.putExtra("altura", edtAltura.text.toString())

            startActivity(intent)
        }
    }
}