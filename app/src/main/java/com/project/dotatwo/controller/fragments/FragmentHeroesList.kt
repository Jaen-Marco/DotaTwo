package com.project.dotatwo.controller.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.dotatwo.R
import com.project.dotatwo.databinding.FragmentHeroesListBinding

class FragmentHeroesList : Fragment() {
    private lateinit var binding: FragmentHeroesListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentHeroesListBinding.inflate(inflater)
        return binding.root
    }

    //TODO Falta crear el método OnViewCreated donde se configura el servicio (Estudiar corrutinas)
    //TODO FALTA IMPLEMENTAR EL ADAPTADOR PARA HÉROES

    companion object {
        fun newInstance(): FragmentHeroesList = FragmentHeroesList()
    }

}