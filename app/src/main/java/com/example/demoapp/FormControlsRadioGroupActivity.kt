package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FormControlsRadioGroupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_controls_radio_group)

    }


    /** Called when the user activates the 'Examples' button */
    fun moveFormControlsRadioGroupSub1(view: View) {
        // Moves user to the activity FormControlsRadioGroupSub1Activity
        val intent = Intent(this, FormControlsRadioGroupSub1Activity::class.java)
        startActivity(intent)
    }

    /** Called when the user activates the 'Form Controls' button */
    fun moveFormControls(view: View) {
        // Moves user to the activity FormControlsActivity
        val intent = Intent(this, FormControlsActivity::class.java)
        startActivity(intent)
    }


    /** Called when the user activates the BackToMenu button */
    fun moveBackHome(view: View) {
        // Do something in response to button
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}