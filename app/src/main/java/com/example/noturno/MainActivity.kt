package com.example.noturno

import android.os.Bundle
import android.view.View
import android.view.gravity
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.noturno.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var languages = arrayOf("JAVA", "PHP", "Javascript", "Python")
    val NEW_SPINNER_ID = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var aa = arrayAdapter(this, android.R.layout.simple_spinner, languages)

        aa.setDropDownViewresource(android.r.layout.simple_spinner_dropdown_item)

            with(sipnner)
            {
                adapter = MainAdapter
                setselection(0, false)
                onItemSelectedListener = this@MainActivity
                prompt = "selecione o seu idioma favorito"
                gravity = gravity.center

            }

        val spinner = spinner(this)
        spinner.id = new_spinner_id

        val ll =

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}