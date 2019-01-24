package com.example.heterogenioussdemo.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.example.heterogenioussdemo.R
import com.example.heterogenioussdemo.pojo.SingleVertical
import com.example.heterogenioussdemo.pojo.TextSingleVertical

import java.util.ArrayList


class VerticalTXTIMAGAdapter(data: ArrayList<TextSingleVertical>) : RecyclerView.Adapter<VerticalTXTIMAGAdapter.MyViewHolder>() {
    private var data = ArrayList<TextSingleVertical>()

    init {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.vertical_txt_img_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageResource(data[position].image)
        holder.title.text = data[position].header
        holder.description.text = data[position].subHeader
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var image: ImageView
        internal var title: TextView
        internal var description: TextView

        init {
            image = itemView.findViewById<View>(R.id.image) as ImageView
            title = itemView.findViewById<View>(R.id.title) as TextView
            description = itemView.findViewById<View>(R.id.description) as TextView
        }
    }
}
