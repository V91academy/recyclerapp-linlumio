package com.v1bottoni.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.v1bottoni.myapplication.BoomerCard
import com.v1bottoni.myapplication.MainActivity
import com.v1bottoni.myapplication.R
import org.w3c.dom.Text

class RecycledAdapter(val list: List<BoomerCard>, var context:Context):RecyclerView.Adapter<RecycledAdapter.CosoViewHolder>() {
    lateinit var cardImage: ImageView

    inner class CosoViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imageCard: ImageView
        val textTitle: TextView
        val text1: TextView
        val text2: TextView

        init {
            imageCard = view.findViewById(R.id.card_img)
            textTitle = view.findViewById(R.id.txt_title)
            text1 = view.findViewById(R.id.txt_1)
            text2 = view.findViewById(R.id.txt_2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CosoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return CosoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CosoViewHolder, position: Int) {
        val boomerCard = list.get(position)
        holder.textTitle.text = boomerCard.title
        holder.text1.text = boomerCard.txt1
        holder.text2.text = boomerCard.txt2
        Glide.with(context)
            .load(boomerCard.url)
            .into(holder.imageCard)
    }

    override fun getItemCount(): Int = list.size




}