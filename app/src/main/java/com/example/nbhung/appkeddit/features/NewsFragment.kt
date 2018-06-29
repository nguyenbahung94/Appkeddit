package com.example.nbhung.appkeddit.features

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nbhung.appkeddit.R
import com.example.nbhung.appkeddit.commons.inflate
import kotlinx.android.synthetic.main.news_fragment.*

class NewsFragment : Fragment() {
    /*
    The lazy block will be executed when we use it
    * */
    private val newsList by lazy {
        news_list
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return container?.inflate(R.layout.news_fragment)!!
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //Lazy executed!
        newsList.setHasFixedSize(true)
        newsList.layoutManager = LinearLayoutManager(activity)

        initAdapter()
    }

    private fun initAdapter() {
        if (newsList.adapter == null) {
        }
    }
}