package com.dias.aulafragment.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.dias.aulafragment.R

//class ConversasFragment : Fragment(R.layout.fragment_conversas)
class ConversasFragment : Fragment() {

    private lateinit var btnExecutar: Button
    private lateinit var textNome: TextView
    private lateinit var editNome: EditText
    private lateinit var textCategoria: TextView

    //pode ser nulo
    private var categoria: String? = null
    private var usuario: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "Fragment onCreate")
        categoria = arguments?.getString("categoria")
        usuario = arguments?.getString("usuario")
    }

    //Aqui é criada a visualização
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Ciclo_vida", "Fragment onCreateView")
        val view = inflater.inflate(
            //Layout que vou utilizar
            R.layout.fragment_conversas,
            //Onde ele será colocado
            container,
            false
        )

        //Processamento da visualização
        //Recuperar os componentes da interface

        btnExecutar = view.findViewById(R.id.btn_executar)
        editNome = view.findViewById(R.id.edit_nome)
        textNome = view.findViewById(R.id.text_nome)
        textCategoria = view.findViewById(R.id.text_categoria)

        textCategoria.text = categoria
        textNome.text = usuario

        btnExecutar.setOnClickListener {
            val nome = editNome.text.toString()
            textNome.text = nome
        }

        return view
    }

    /*Depreciado
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
    */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo_vida", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo_vida", "Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida", "Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo_vida", "Fragment onDetach")
    }
}