package com.example.nbhung.appkeddit.features.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.nbhung.appkeddit.R
import com.example.nbhung.appkeddit.R.id.*
import com.example.nbhung.appkeddit.commons.RedditNewsItem
import com.example.nbhung.appkeddit.commons.ViewType
import com.example.nbhung.appkeddit.commons.getFriendlyTime
import com.example.nbhung.appkeddit.commons.inflate

class NewsDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
        /*    img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()*/
        }
    }
}

