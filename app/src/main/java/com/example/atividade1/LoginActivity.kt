package com.example.atividade1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("LOGTESTE ON CREATE OK")
        setContentView(R.layout.login_activity)

        var editTextEmail = findViewById<EditText>(R.id.editTextEmail)

        var editTextPassword = findViewById<EditText>(R.id.editTextPassword)

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            var email = editTextEmail.text.toString()
            var password = editTextPassword.text.toString();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(
                    this,
                    "Enter a valid email and password",
                    Toast.LENGTH_LONG
                ).show()
            }
            else {
                openMainActivity()
            }
        }
    }

    private fun openMainActivity() {
        val mainActivity = Intent(this, MainActivity::class.java)
        startActivity(mainActivity)
    }

    override fun onStart() {
        super.onStart()
        println("LOLOGTESTEG ONSTART OK")
    }

    override fun onResume() {
        super.onResume()
        println("LOGTESTE ONRESUME OK")
    }

    override fun onPause() {
        super.onPause()
        println("LOGTESTE ONPAUSE OK")
    }

    override fun onStop() {
        super.onStop()
        println("LOGTESTE ONSTOP OK")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("LOGTESTE ONDESTROY OK")
    }
}




