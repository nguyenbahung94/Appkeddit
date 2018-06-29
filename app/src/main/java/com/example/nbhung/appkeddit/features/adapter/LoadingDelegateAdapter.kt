package com.example.nbhung.appkeddit.features.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.nbhung.appkeddit.R
import com.example.nbhung.appkeddit.commons.ViewType
import com.example.nbhung.appkeddit.commons.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = TurnViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading))
}