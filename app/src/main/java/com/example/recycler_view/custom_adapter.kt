package com.example.recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_task.R

class MyAdapter(private val items : List<ItemModel>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    class  ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
       val imageView : ImageView = itemView.findViewById(R.id.image)
        val textView : TextView = itemView.findViewById(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.rv_design_item,
                parent,
                false
            )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.textView.text = item.text
        val context = holder.imageView.context
        val resourceId = context.resources.getIdentifier(item.imageTitle, "drawable", context.packageName)
        holder.imageView.setImageResource(resourceId)
    }
}