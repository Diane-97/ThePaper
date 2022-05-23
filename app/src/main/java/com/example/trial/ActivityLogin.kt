package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.trial.R.layout.*
import com.google.android.material.textfield.TextInputEditText


class ActivityLogin : AppCompatActivity() {

    private var thelogin: Button? = null
    private var btnRegister: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_login)

        setSupportActionBar(findViewById(R.id.chtl_toolbar))

        thelogin = findViewById<View>(R.id.btnLogin) as Button
        btnRegister = findViewById<View>(R.id.btnRegister) as Button

        fun login(userName: String, password: String) {
            if (userName == "name" && password == "1234") {
                startActivity(Intent(this, MainActivity::class.java))
                Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }
            thelogin!!.setOnClickListener {
                // displaying a toast message
                fun onclick(view: View) {
                    login(
                        findViewById<TextInputEditText>(R.id.edtUserEmail).text.toString(),
                        findViewById<TextInputEditText>(R.id.edtPassword).text.toString()
                    )
                }
            }
        btnRegister!!.setOnClickListener {
            startActivity(Intent(this, ActivityRegister::class.java))
            finish()
        }
    }
}