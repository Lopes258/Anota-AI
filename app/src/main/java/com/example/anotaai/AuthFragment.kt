package com.example.anotaai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation


class AuthFragment : Fragment(), View.OnClickListener {

    //Definir o Navigation
    lateinit var navController: NavController
    private val isFirstAccess = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    //Configurar primeiro acesso
    override fun onClick(view: View?) {
        if (isFirstAccess){
            navController.navigate(R.id.action_authFragment_to_login)
        } else{
            navController.navigate(R.id.action_authFragment_to_shopFragment)
        }

    }
}