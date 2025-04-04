package com.dias.aulacomponenteslistagemcolecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar : Button
    private lateinit var textResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = Intent(this, MainActivity::class.java)

        intent.putExtra("nome", "Gabriel Dias")

        startActivity(intent)

        //Utiliar o metodo findViewById que está dentro do da MainActivity que está herdando do AppCompatActivity()

        btnExecutar = findViewById(R.id.btn_executar)
        textResultado = findViewById(R.id.text_resultado)

        /*btnExecutar.setOnClickListener {
            textResultado.text = "Gabriel Dias"
        }*/

    }

    fun cliqueBotao(view: View) {

        //Exibir mensagens de erro
        Toast.makeText(
            this,
            "Sucesso ao fazer algo",
            Toast.LENGTH_LONG
        ).show()
        
        
        textResultado.text = "GABRIEL DIAS"
    }
}