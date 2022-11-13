package com.example.myrecyclerview2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class tourListAdapter(private val context: Context, private val tour: List<tour>, val listener: (tour) -> Unit)
    : RecyclerView.Adapter<tourListAdapter.tourViewHolder>(){


    class tourViewHolder(view: View): RecyclerView.ViewHolder(view){
        val name = view.findViewById<TextView>(R.id.tv_item_name)
        val description = view.findViewById<TextView>(R.id.tv_item_description)
        val photo = view.findViewById<ImageView>(R.id.img_item_photo)


        fun bindView(tour: tour, listener: (tour) -> Unit){
            photo.setImageResource(tour.photo)
            name.text = tour.name
            description.text = tour.description
            itemView.setOnClickListener{
                listener(tour)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tourViewHolder {
        return tourViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_wisata, parent, false)
        )
    }

    override fun onBindViewHolder(holder: tourViewHolder, position: Int) {
        holder.bindView(tour[position], listener)
    }

    override fun getItemCount(): Int = tour.size

}