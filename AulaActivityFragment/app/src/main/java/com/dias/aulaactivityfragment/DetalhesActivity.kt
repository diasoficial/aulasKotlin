package com.dias.aulaactivityfragment

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var textFilme: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonFechar = findViewById(R.id.button_fechar)
        textFilme = findViewById(R.id.textFilme)

        //Recupera todos os parâmetros passados na tela anterior
        val bundle = intent.extras
        if (bundle != null) {
            /*val filme = bundle.getString("filme")
            val classificacao = bundle.getInt("classificacao")
            val avaliacoes = bundle.getDouble("avaliacoes")
            val resultado = "filme: $filme - class. $classificacao aval. $avaliacoes"

            textFilme.text = resultado
            */

            //Teste para saber qual é a versão do android
            val filme = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                //bundle.getSerializable("filme", Filme::class.java)
                bundle.getParcelable("filme", Filme::class.java)
            } else {
                //bundle.getSerializable("filme") as Filme
                bundle.getParcelable("filme")
            }
            textFilme.text = "${filme?.nome} - ${filme?.distribuidor}"



        }

        buttonFechar.setOnClickListener{
            finish()
        }
    }
}