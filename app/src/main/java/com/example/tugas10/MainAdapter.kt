package com.example.tugas10

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

internal class MainAdapter(
    private val context: Context,
    private val menusName: Array<String>,
    private val numberImage: IntArray
) :
    BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun getCount(): Int {
        return menusName.size
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var _convertView = convertView

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (_convertView == null) {
            _convertView = layoutInflater!!.inflate(R.layout.row_item, null)
        }

        imageView = _convertView!!.findViewById(R.id.imageView)
        textView = _convertView.findViewById(R.id.textView)

        imageView.setImageResource(numberImage[position])
        textView.text = menusName[position]

        return _convertView
    }
}
