package com.dias.aulafragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dias.aulafragment.R

class ConversasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            //Layout que vou utilizar
            R.layout.fragment_conversas,
            //Onde ele será colocado
            container,
            false
        )

        //Processamento da visualização
        //view.findViewById<>()

        return view
    }
}