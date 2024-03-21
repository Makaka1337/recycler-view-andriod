package com.example.myapplication

import android.view.ViewGroup
import android.view.ViewParent

class Adapter {
    private val list = mutableListOf<String>()

    fun addValue(value: String){
        list.add(value)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding
    }

    override fun onBindViewHolder
}

class RecyclerViewHolder(private val binding: ItemLayoutBuilding) : {

    fun bind(string: String){
        binding.textView.text = str
    }

}