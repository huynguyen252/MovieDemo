// Safe here as method are used by Data binding
@file:Suppress("unused")

package com.ribisoft.gapodemo.utils

import android.graphics.Color
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.ttc.demo.movie.R


/**
 * Sets a LayoutManager to a RecyclerView (to be used in view with one RecyclerView)
 * @param view the RecyclerView on which to set the LayoutManager
 * @param layoutManager the LayoutManager to set to the RecyclerView
 */
@BindingAdapter("layoutManager")
fun setLayoutManager(view: RecyclerView, layoutManager: RecyclerView.LayoutManager) {
    view.layoutManager = layoutManager
}

@BindingAdapter("bg_view")
fun setBackgroundView(view: View, color: String) {
    view.setBackgroundColor(Color.parseColor(color))
}

@BindingAdapter("setIcon")
fun setIconUrl(view: ImageView, url: String?) {
    Utils.loadGlide(
        view.context,
        url,
        ContextCompat.getDrawable(view.context, R.drawable.ic_not_found)!!,
        view
    )
}

@BindingAdapter("setAdapter")
fun setAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) {
    recyclerView.adapter = adapter
}


@BindingAdapter("setDate")
fun setDate(textView: TextView, date: String) {
    textView.text = Utils.convertStringToTime(date)
}

/**
 * Adds a DividerItemDecoration to a RecyclerView (to be used in view with one RecyclerView)
 * @param view the RecyclerView on which to set the DividerItemDecoration
 * @param dividerItemDecoration the DividerItemDecoration to set to the RecyclerView
 */
@BindingAdapter("dividerItemDecoration")
fun setDividerItemDecoration(view: RecyclerView, dividerItemDecoration: DividerItemDecoration) {
    view.addItemDecoration(dividerItemDecoration)
}

