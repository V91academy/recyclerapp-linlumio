package com.v1bottoni.myapplication.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.v1bottoni.myapplication.R

class RecycledAdapter(val list: List<String>, var onItemClick: ((String)->Unit)):RecyclerView.Adapter<RecycledAdapter.CosoViewHolder>() {
    inner class CosoViewHolder(view: View):RecyclerView.ViewHolder(view){
        val textView: TextView

        init {
            textView = view.findViewById(R.id.item_text)
        }
    }


}