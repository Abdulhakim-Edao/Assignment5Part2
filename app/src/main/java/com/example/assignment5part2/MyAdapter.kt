package com.example.assignment5part2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.grid_items.view.*

class MyAdapter(var context:Context, var text1: Array<String>, var img: IntArray, var text2:Array<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =LayoutInflater.from(parent?.context).inflate(R.layout.grid_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.playout.apply{
            imageView.setImageResource(img[position])
            textView.text = text1[position]
        }

        holder.itemView.playout.setOnClickListener{
            val intent = Intent(context, Details::class.java)

            Toast.makeText(context,"You Clicked ${text1[position]}", Toast.LENGTH_SHORT).show()

            intent.putExtra("name", text1[position])
            intent.putExtra("recipe", text2[position])
            intent.putExtra("image", img[position])
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return text1.size
    }
}