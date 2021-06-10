package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FormControlsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_controls)
    }

    /** Called when the user activates the BackToMenu button */
    fun moveBackHome(view: View) {
        // Do something in response to button
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}