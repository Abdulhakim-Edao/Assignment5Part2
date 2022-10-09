package com.example.assignment5part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val intent = intent
        if(intent.hasExtra("name")&& intent.hasExtra("recipe") && intent.hasExtra("image")){
            imageView2.setImageResource(intent.getIntExtra("image", 0))
            textView2.text = intent.getStringExtra("name").toString()
            textView3.text = intent.getStringExtra("recipe").toString()
        }
    }
}