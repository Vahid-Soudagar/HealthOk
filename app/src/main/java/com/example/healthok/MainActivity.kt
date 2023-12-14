package com.example.healthok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.healthok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bining : ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bining = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bining.root)

        navController = findNavController(R.id.nav_host_fragment_container)

        bining.bottomNavView.setupWithNavController(navController)
    }
}