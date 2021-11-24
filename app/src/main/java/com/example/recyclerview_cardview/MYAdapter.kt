package com.example.recyclerview_cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MYAdapter : RecyclerView.Adapter<MYAdapter.MyHolder>() {

    var city_data= arrayOf("RAJKOT","MUMBAI","PUNE","VADODARA")
    var state_data= arrayOf("GUJRAT","MAHARASHTRA","MAHARASHTRA","GUJRAT")
    inner class MyHolder(view:View):RecyclerView.ViewHolder(view){
        var city:TextView
        var state:TextView
        init {
            city=view.findViewById(R.id.textView)
            state=view.findViewById(R.id.textView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var v=LayoutInflater.from(parent.context).
                inflate(R.layout.mylayout,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.city.text=city_data[position]
        holder.state.text=state_data[position]
    }

    override fun getItemCount(): Int {
        return city_data.size
    }
}