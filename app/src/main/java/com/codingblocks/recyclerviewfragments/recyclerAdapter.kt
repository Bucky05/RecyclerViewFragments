package com.codingblocks.recyclerviewfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class recyclerAdapter(val topics:ArrayList<String>):RecyclerView.Adapter<recyclerAdapter.ViewHolder>() {


    override fun getItemCount() = topics.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.firstName.text= topics[position]
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.singlerow,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(singlerow:View):RecyclerView.ViewHolder(singlerow) {
           val firstName : TextView = singlerow.findViewById(R.id.text12)
    }
}