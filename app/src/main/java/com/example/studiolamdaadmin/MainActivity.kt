package com.example.studiolamdaadmin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setbutton()
        //window.decorView.setBackgroundColor(ContextCompat.getColor(applicationContext,android.R.color.background_light))
    }

    private fun setbutton() {
        button2.setOnClickListener {
            closeKeyboard(editTextTextEmailAddress2)
            val intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun closeKeyboard(view: View) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}