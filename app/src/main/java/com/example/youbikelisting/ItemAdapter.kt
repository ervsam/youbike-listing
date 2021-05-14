package com.example.youbikelisting

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

class ItemAdapter(private val context: Context, private val dataset: List<DataModel>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val loc: MaterialTextView = view.findViewById(R.id.location)
        val totalBikes: MaterialTextView = view.findViewById(R.id.total_bikes)
        val bikesLeft: MaterialTextView = view.findViewById(R.id.bikes_left)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.loc.text = item.snaen
        holder.totalBikes.text = "Total Bikes: " + item.tot
        holder.bikesLeft.text = "Bikes Remaining: " + item.sbi
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}