package com.example.nbhung.appkeddit.commons

data class RedditNewsItem(val author: String,
                          val title: String,
                          val numComments: Int,
                          val created: Long,
                          val thumbnail: String,
                          val url: String) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}
