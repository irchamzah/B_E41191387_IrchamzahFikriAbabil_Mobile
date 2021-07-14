package com.example.sipapah.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sipapah.R
import com.example.sipapah.helper.SharedPref
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var sp:SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sp = SharedPref(this)

        btn_login.setOnClickListener{

            sp.setStatusLogin(true)
        }


    }
}