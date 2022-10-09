package com.example.assignment5part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var imagess = intArrayOf(
        R.drawable.coffee_pot,
        R.drawable.espresso,
        R.drawable.french_fries,
        R.drawable.honey,
        R.drawable.sugar_cubes,
        R.drawable.strawberry_ice_cream
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = resources.getStringArray(R.array.name)
        var recipe = resources.getStringArray(R.array.recipe)
        rview.layoutManager = GridLayoutManager(this, 2)
        val adapter =MyAdapter(this, name, imagess, recipe)
        rview.adapter= adapter
    }
}