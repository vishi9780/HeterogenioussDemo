package com.example.heterogenioussdemo.adapter

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.heterogenioussdemo.MainActivity.Companion.horizontalData
import com.example.heterogenioussdemo.MainActivity.Companion.verticalData
import com.example.heterogenioussdemo.MainActivity.Companion.verticalDataTxtImg
import com.example.heterogenioussdemo.R
import com.example.heterogenioussdemo.pojo.SingleHorizontal
import com.example.heterogenioussdemo.pojo.SingleVertical
import com.example.heterogenioussdemo.pojo.TextSingleVertical
import java.util.ArrayList

class MainAdapter(private val context: Context, private val items: ArrayList<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val VERTICALIMAGETXT = 0
    private val VerticalTXTIMGViewHolder = 1
    private val HORIZONTAL = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view: View
        val holder: RecyclerView.ViewHolder
        when (viewType) {
            VERTICALIMAGETXT -> {
                view = inflater.inflate(R.layout.vertical, parent, false)
                holder = VerticalViewHolder(view)
            }
            VerticalTXTIMGViewHolder -> {
                view = inflater.inflate(R.layout.vertical, parent, false)
                holder = VerticalTXTIMGViewHolderr(view)
            }
            HORIZONTAL -> {
                view = inflater.inflate(R.layout.horizontal, parent, false)
                holder = HorizontalViewHolder(view)
            }

            else -> {
                view = inflater.inflate(R.layout.horizontal, parent, false)
                holder = HorizontalViewHolder(view)
            }
        }


        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder.itemViewType == VERTICALIMAGETXT) {
            verticalView(holder as VerticalViewHolder)
        } else if (holder.itemViewType == VerticalTXTIMGViewHolder) {
            VerticalTXTIMGViewHolder(holder as VerticalTXTIMGViewHolderr)
        } else if (holder.itemViewType == HORIZONTAL) {
            horizontalView(holder as HorizontalViewHolder)
        }
    }

    private fun verticalView(holder: VerticalViewHolder) {

        val adapter1 = VerticalAdapter(verticalData)
        holder.recyclerView.layoutManager = LinearLayoutManager(context)
        holder.recyclerView.adapter = adapter1
    }

    private fun VerticalTXTIMGViewHolder(holder: VerticalTXTIMGViewHolderr) {

        val adapte = VerticalTXTIMAGAdapter(verticalDataTxtImg)
        holder.recyclerView.layoutManager = LinearLayoutManager(context)
        holder.recyclerView.adapter = adapte
    }


    private fun horizontalView(holder: HorizontalViewHolder) {
        val adapter = HorizontalAdapter(horizontalData)
        holder.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        holder.recyclerView.adapter = adapter
    }


    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        if (items[position] is SingleVertical) {
            return VERTICALIMAGETXT
        }
        if (items[position] is TextSingleVertical) {
            return VerticalTXTIMGViewHolder
        }
        return if (items[position] is SingleHorizontal) {
            HORIZONTAL
        } else -1


    }

    inner class HorizontalViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var recyclerView: RecyclerView

        init {
            recyclerView = itemView.findViewById<View>(R.id.inner_recyclerView) as RecyclerView
        }
    }

    inner class VerticalViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var recyclerView: RecyclerView

        init {
            recyclerView = itemView.findViewById<View>(R.id.inner_recyclerView) as RecyclerView
        }
    }

    inner class VerticalTXTIMGViewHolderr internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var recyclerView: RecyclerView

        init {
            recyclerView = itemView.findViewById<View>(R.id.inner_recyclerView) as RecyclerView
        }
    }
}
