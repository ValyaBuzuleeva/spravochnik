package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
    }
    fun naz5 (view: View){
        val intent : Intent = Intent(this@MainActivity7, MainActivity2::class.java)
        startActivity(intent)

    }
}