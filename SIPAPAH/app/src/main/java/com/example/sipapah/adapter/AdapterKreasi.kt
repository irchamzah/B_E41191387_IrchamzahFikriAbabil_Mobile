package com.example.sipapah.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sipapah.R
import com.example.sipapah.model.Kreasi

class AdapterKreasi(var arrDataKreasi:ArrayList<Kreasi>):RecyclerView.Adapter<AdapterKreasi.Holder>() {

    class Holder(view: View):RecyclerView.ViewHolder(view) {
        val tvNama = view.findViewById<TextView>(R.id.tv_nama)
        val imgKreasi = view.findViewById<ImageView>(R.id.img_kreasi)
        val tvKeterangan = view.findViewById<TextView>(R.id.tv_keterangan)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kreasi, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return arrDataKreasi.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvNama.text = arrDataKreasi[position].nama
        holder.tvKeterangan.text = arrDataKreasi[position].keterangan
        holder.imgKreasi.setImageResource(arrDataKreasi[position].foto)

    }


}