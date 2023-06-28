package com.campelo.passandodadosentreactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    private lateinit var txtNome: TextView
    private lateinit var txtPeso: TextView
    private lateinit var txtAltura: TextView
    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        txtNome = findViewById(R.id.txtNome)
        txtPeso = findViewById(R.id.txtPeso)
        txtAltura = findViewById(R.id.txtAltura)
        btnVoltar = findViewById(R.id.btnVoltar)

        val bundle = intent.extras

        if(bundle != null){
            txtNome.text = "Nome: ${bundle.getString("nome")}"
            txtPeso.text = "Peso: ${bundle.getString("peso")}"
            txtAltura.text = "Altura: ${bundle.getString("altura")}"
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}