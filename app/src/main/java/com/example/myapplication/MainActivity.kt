
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun act2 (view: View){
        val intent : Intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
 }
    fun exit1(view: View){
        finish()
    }
}
