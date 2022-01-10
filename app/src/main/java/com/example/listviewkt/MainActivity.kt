package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.listviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        val item = arrayOf("apple","peach","kiwi","changhyeon")
//        binding.listView.adapter=ArrayAdapter(this, android.R.layout.simple_list_item_1, item) //context란 한 액티비티의 모든 정보를 담고있다.


    }
}