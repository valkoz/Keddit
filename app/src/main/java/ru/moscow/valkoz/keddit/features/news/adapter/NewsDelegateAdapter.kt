package ru.moscow.valkoz.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_item.view.*
import ru.moscow.valkoz.keddit.R
import ru.moscow.valkoz.keddit.commoms.RedditNewsItem
import ru.moscow.valkoz.keddit.commoms.adapter.ViewType
import ru.moscow.valkoz.keddit.commoms.adapter.ViewTypeDelegateAdapter
import ru.moscow.valkoz.keddit.commoms.extensions.getFriendlyTime
import ru.moscow.valkoz.keddit.commoms.extensions.inflate
import ru.moscow.valkoz.keddit.commoms.extensions.loadImg

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
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}