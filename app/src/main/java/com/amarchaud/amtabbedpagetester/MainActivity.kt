package com.amarchaud.amtabbedpagetester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_first_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.splashFragment,
                R.id.tabFirstLeftFragment,
                R.id.tabFirstRightFragment
            )
        )

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