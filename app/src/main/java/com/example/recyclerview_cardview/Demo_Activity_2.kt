package com.example.recyclerview_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Demo_Activity_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo2)

        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView2)
        recyclerView.adapter=MyAdapter2(applicationContext)

        var layout= LinearLayoutManager(this)
        recyclerView.layoutManager=layout

    }
}