package com.dias.aulafragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.dias.aulafragment.fragments.ChamadasFragment
import com.dias.aulafragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnMercado: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnMercado = findViewById(R.id.btn_mercado)
        btnChamadas = findViewById(R.id.btn_chamadas)

        /*val fragmentManager = supportFragmentManager.beginTransaction()

        //Diversas alterações em fragments

        //Aqui recebe o fragmentContainerView
        fragmentManager.add(R.id.fragment_conteudo, ConversasFragment())

        fragmentManager.commit()*/
        btnMercado.setOnClickListener {
            //Estamos passando parametros de uma activity para um fragment
            /* Modelo 1
            val conversasFragment = ConversasFragment()

            val bundle = bundleOf(
                //Chave que usa para recupera um dado e valor
                "categoria" to "mercado",
                "usuario" to "Gabriel"
            )
            conversasFragment.arguments = bundle

            supportFragmentManager
                .beginTransaction()
                //.add Adiciona uma certa fragment
                //.replace Substitui uma certa fragment
                //.remove
                .replace(R.id.fragment_conteudo, conversasFragment )
                .commit()
             */

            /*Modelo 2*/

            val bundle = bundleOf(
                //Chave que usa para recupera um dado e valor
                "categoria" to "mercado",
                "usuario" to "Gabriel"
            )

            supportFragmentManager.commit {
                replace<ConversasFragment>(
                    R.id.fragment_conteudo,
                    args = bundle
                )
            }
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
                .commit()
        }
    }
}