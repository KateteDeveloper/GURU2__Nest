package com.example.guru2

import androidx.activity.ComponentActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homelogin);

        val buttonIn = findViewById<Button>(R.id.makingTeam)
        val buttonLogin = findViewById<Button>(R.id.login)
        buttonIn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val myIntent = Intent(this@MainActivity, TeamLogin::class.java)
                startActivity(myIntent)

            }
        })

        buttonLogin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val myIntent = Intent(this@MainActivity, Login::class.java)
                startActivity(myIntent)

            }
        })



    }
}