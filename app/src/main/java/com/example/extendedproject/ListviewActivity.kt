package com.example.extendedproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListviewActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        var names= arrayOf("laureen","Daniel","Tony","Pavin","Angela","laureen","Daniel","Tony","Pavin","Angela","laureen","Daniel","Tony","Pavin","Angela")
        var myadapter=ArrayAdapter(this,R.layout.list_item,names)

        var mylist:ListView=findViewById(R.id.List1)

        mylist.setAdapter(myadapter)

    }
}