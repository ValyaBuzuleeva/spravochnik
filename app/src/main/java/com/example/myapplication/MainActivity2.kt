package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun act3(view: View) {
        val intent: Intent = Intent(this@MainActivity2, MainActivity3::class.java)
        startActivity(intent)
    }

    fun act4(view: View) {
        val intent: Intent = Intent(this@MainActivity2, MainActivity4::class.java)
        startActivity(intent)
    }

    fun act5(view: View) {
        val intent: Intent = Intent(this@MainActivity2, MainActivity5::class.java)
        startActivity(intent)
    }
    fun act6(view: View) {
        val intent: Intent = Intent(this@MainActivity2, MainActivity6::class.java)
        startActivity(intent)
    }
    fun act7(view: View) {
        val intent: Intent = Intent(this@MainActivity2, MainActivity7::class.java)
        startActivity(intent)
    }
    fun act8(view: View) {
        val intent: Intent = Intent(this@MainActivity2, MainActivity8::class.java)
        startActivity(intent)
    }
    fun naz8 (view: View){
        val intent : Intent = Intent(this@MainActivity2, MainActivity::class.java)
        startActivity(intent)

    }
}