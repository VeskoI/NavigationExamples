package com.example.vesseliniliev.navigationexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavHost
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavHost {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupWithNavController(bottom_navigation_view, navController)
    }

    override fun getNavController() = Navigation.findNavController(this, R.id.navigation_host)

    override fun onSupportNavigateUp() = navController.navigateUp()

    override fun onBackPressed() {
        val handled = navController.popBackStack()
        if (!handled) {
            super.onBackPressed()
        }
    }
}