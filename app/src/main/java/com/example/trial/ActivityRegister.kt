package com.example.trial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class ActivityRegister : AppCompatActivity() {

    private var bt_register: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Declaring and Initializing
        // the TextView from the layout file
        val linkTextView = findViewById<TextView>(R.id.directive)
        val ClinkView = findViewById<TextView>(R.id.btn_checkbox)

        // Finding and displaying the content
        // that consists a URL as a hyperlink
        linkTextView.movementMethod = LinkMovementMethod.getInstance()
        ClinkView.movementMethod = LinkMovementMethod.getInstance()

        setSupportActionBar(findViewById(R.id.chtl_toolbar))

        bt_register = findViewById<View>(R.id.bt_register) as Button

        fun register(userName: String, password: String, toString: String, toString1: String) {
            if (userName == "name" && password == "1234") {
                startActivity(Intent(this, MainActivity::class.java))
                Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }
        bt_register!!.setOnClickListener {
            // displaying a toast message
            fun onclick(view: View) {
                register(
                    findViewById<TextInputEditText>(R.id.et_first_name).text.toString(),
                    findViewById<TextInputEditText>(R.id.et_last_name).text.toString(),
                    findViewById<TextInputEditText>(R.id.et_phonenumber).text.toString(),
                    findViewById<TextInputEditText>(R.id.et_email).text.toString()
                )
            }
        }
        bt_register!!.setOnClickListener {   // displaying a toast message
            startActivity(Intent(this, ActivityHome::class.java))
            finish()
        }
    }
}
