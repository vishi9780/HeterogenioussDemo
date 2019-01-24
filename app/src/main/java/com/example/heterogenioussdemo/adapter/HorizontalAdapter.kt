package com.example.heterogenioussdemo.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


import com.example.heterogenioussdemo.R
import com.example.heterogenioussdemo.pojo.SingleHorizontal

import java.util.ArrayList


class HorizontalAdapter(data: ArrayList<SingleHorizontal>) : RecyclerView.Adapter<HorizontalAdapter.MyViewHolder>() {

    internal var data = ArrayList<SingleHorizontal>()

    init {
        this.data = data

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_single_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.description.text = data[position].desc
        holder.title.text = data[position].title
        holder.pubDate.text = data[position].pubDate
        holder.image.setImageResource(data[position].images)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var title: TextView
        internal var description: TextView
        internal var pubDate: TextView
        internal var image: ImageView

        init {
            title = itemView.findViewById<View>(R.id.title) as TextView
            description = itemView.findViewById<View>(R.id.description) as TextView
            pubDate = itemView.findViewById<View>(R.id.published_date) as TextView
            image = itemView.findViewById<View>(R.id.image_view) as ImageView
        }
    }
}
