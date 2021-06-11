package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FormControlsRadioGroupSub1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_controls_radio_group_sub1)
    }

    /** Called when the user activates the 'Back to Radio Groups' button */
    fun moveBackFormControlsRadioGroup(view: View) {
        // Moves user to the activity FormControlsRadioGroupActivity
        val intent = Intent(this, FormControlsRadioGroupActivity::class.java)
        startActivity(intent)
    }

    /** Called when the user activates the BackToMenu button */
    fun moveBackHome(view: View) {
        // Do something in response to button
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}