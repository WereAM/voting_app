package com.example.votingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CategoriesListAdapter(var mCtx:Context, var resource:Int, var items:List<Model>)
    :ArrayAdapter<Model>(mCtx, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        Inflate layout
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resource, null)
        val imageView:ImageView = view.findViewById(R.id.iconLevel)
        val textView1:TextView = view.findViewById(R.id.positionLevel)
        val textView2:TextView = view.findViewById(R.id.descriptionLevel)

        var mItems:Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.photo))
        textView1.text = mItems.position
        textView2.text = mItems.description

        return view
    }
}