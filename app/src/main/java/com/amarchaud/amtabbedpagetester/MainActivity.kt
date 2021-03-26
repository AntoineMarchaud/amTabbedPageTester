package com.amarchaud.amtabbedpagetester

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.amarchaud.amtabbedpagetester.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_first_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.tabFirstLeftFragment,
                R.id.tabFirstRightFragment
            )
        )


        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id) {
                R.id.tabFirstLeftFragment -> {

                }
                R.id.tabFirstRightFragment -> {

                }
            }
        }

        // bottom nav
        findViewById<BottomNavigationView>(R.id.bottom_nav).setupWithNavController(navController)

        // action bar
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.my_first_host_fragment)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}