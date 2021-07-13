package com.example.sipapah.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sipapah.R
import com.example.sipapah.model.Kreasi

class AdapterKreasi(var arrDataKreasi:ArrayList<Kreasi>):RecyclerView.Adapter<AdapterKreasi.Holder>() {
    class Holder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.fragment_home, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return arrDataKreasi.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

    }


}