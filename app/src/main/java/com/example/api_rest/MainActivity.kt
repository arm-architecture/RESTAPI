package com.example.api_rest

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.api_rest.helper.PhotoAPI

class MainActivity : AppCompatActivity()
{
    lateinit var txtViewMessage: TextView
    lateinit var btnGetMethod: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtViewMessage = findViewById(R.id.txtViewMessage)
        btnGetMethod = findViewById(R.id.btnGetMethod)

        btnGetMethod.setOnClickListener {
                txtViewMessage.text = PhotoAPI.service.
        }
    }
}