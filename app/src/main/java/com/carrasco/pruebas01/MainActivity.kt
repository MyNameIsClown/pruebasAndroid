package com.carrasco.pruebas01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tvText)
        val paquitoImage = findViewById<ImageView>(R.id.paquito)
        paquitoImage.visibility = View.INVISIBLE
        tv.text = "Hola Juan"
        tv.visibility = View.INVISIBLE
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            if (paquitoImage.visibility == View.INVISIBLE){
                paquitoImage.visibility = View.VISIBLE
            }else{
                paquitoImage.visibility = View.INVISIBLE
            }

        }
    }
}