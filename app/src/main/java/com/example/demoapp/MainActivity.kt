package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.demoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user activates the 'Basic Layout Testing' button */
    fun moveBasicLayoutTesting(view: View) {
        // Moves user to the activity BasicLayoutTestingActivity
        val intent = Intent(this, BasicLayoutTestingActivity::class.java)
        startActivity(intent)
    }

    /** Called when the user activates the 'Form Controls' button */
    fun moveFormControls(view: View) {
        // Moves user to the activity FormControlsActivity
        val intent = Intent(this, FormControlsActivity::class.java)
        startActivity(intent)
    }

    /** Called when the user activates the 'Sandbox' button */
    fun moveSandbox(view: View) {
        // Moves user to the activity SandboxActivity
        val intent = Intent(this, SandboxActivity::class.java)
        startActivity(intent)
    }

}