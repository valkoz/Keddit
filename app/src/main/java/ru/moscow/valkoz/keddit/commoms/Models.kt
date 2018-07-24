package ru.moscow.valkoz.keddit.commoms

import ru.moscow.valkoz.keddit.commoms.adapter.AdapterConstants
import ru.moscow.valkoz.keddit.commoms.adapter.ViewType

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}