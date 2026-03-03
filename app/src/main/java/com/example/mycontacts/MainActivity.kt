package com.example.mycontacts

import android.location.Address
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName = "Aisha"
        val lastName ="Appoles"
        val address ="CapeTown"
        val isMale ="False"
        val dayOfBirth="16"
        val monthOfBirth="March"
        val yearOfBirth="1979"
        println()("Hello my name is", firstName = "Uthmaan", lastName = Appoles, "I live in CapeTown")
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}