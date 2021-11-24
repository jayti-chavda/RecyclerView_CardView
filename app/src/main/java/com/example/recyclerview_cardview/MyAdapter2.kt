package com.example.recyclerview_cardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter2() : RecyclerView.Adapter<MyAdapter2.MyHolder>() {

    lateinit var context : Context
    constructor(context: Context):this(){
        this.context=context
    }

    var vimage= arrayOf(R.drawable.cupcake,R.drawable.donut,R.drawable.droidgrn,R.drawable.eclair,R.drawable.froyo,
                        R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ics,R.drawable.jellybean,
                        R.drawable.kitkat,R.drawable.lollipop,R.drawable.marsh,R.drawable.nougat,
                        R.drawable.oreo,R.drawable.pie)

    var vname= arrayOf("Cupcake","Donut","droidgrn","eclair","froyo", "gingerbread","honeycomb",
        "ics","jellybean","kitkat","lollipop","marsh","nougat","oreo","pie")

    var vno= arrayOf("1.5","1.6","2.0-2.1","2.2-2.2.3","2.3-2.3.7", "3.0-3.2.6","4.0-4.0.4",
        "4.1-1.3.1","4.4-4.4.4","5.0-5.1.1","6.0 - 6.0.1","7.0","7.1.0 - 7.1.2","8.1","9.0")

    inner class MyHolder(view:View) : RecyclerView.ViewHolder(view)
    {
        var vno : TextView
        var vname : TextView
        var vimage : ImageView

        init {
            vno=view.findViewById(R.id.textView3)
            vname=view.findViewById(R.id.textView4)
            vimage=view.findViewById(R.id.image1)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var v=LayoutInflater.from(parent.context).inflate(
            R.layout.mylayout2,parent,false
        )
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.vno.text=vno[position]
        holder.vname.text=vname[position]
        holder.vimage.setImageResource(vimage[position])

        holder.vname.setOnClickListener {
            Toast.makeText(context,vname[position],Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return vno.size
    }
}