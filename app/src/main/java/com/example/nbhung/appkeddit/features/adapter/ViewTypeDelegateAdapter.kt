package com.example.nbhung.appkeddit.features.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.nbhung.appkeddit.commons.ViewType

interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}