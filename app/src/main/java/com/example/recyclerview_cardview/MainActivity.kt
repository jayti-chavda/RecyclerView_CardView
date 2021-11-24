package com.example.recyclerview_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter=MYAdapter()

        var layout=LinearLayoutManager(this)
        recyclerView.layoutManager=layout
    }
}