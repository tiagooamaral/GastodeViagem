package com.example.assetinventory

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)

            btnLogin.setOnClickListener(this)


        }

    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.btnLogin) {
            val intent = Intent(
                this, MainActivity::class.java)
            startActivity (intent)
        }
    }
}