package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class second_pageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
    }

    /** Called when the user activates the Previous Page button */
    fun movePreviousPage(view: View) {
        // Do something in response to button
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}