package ru.moscow.valkoz.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import ru.moscow.valkoz.keddit.R
import ru.moscow.valkoz.keddit.commoms.adapter.ViewType
import ru.moscow.valkoz.keddit.commoms.adapter.ViewTypeDelegateAdapter
import ru.moscow.valkoz.keddit.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)
    )


}