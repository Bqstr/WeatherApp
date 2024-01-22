package com.nurgylesimsapplication.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.nurgylesimsapplication.app.databinding.ActivityMainBinding
import com.nurgylesimsapplication.app.databinding.ActivityMorningBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        val navHostFrgament =supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController =navHostFrgament.navController
        val bottomNavigationView =binding.bottomNavigationView
        setupWithNavController(bottomNavigationView ,navController)






        setContentView(binding.root)


    }
}