package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(var mCtx:Context , var resource:Int,var items:List<Model>)
    :ArrayAdapter<Model>( mCtx , resource , items ){




    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val imageView :ImageView = view.findViewById(R.id.iconPic)
        var textView : TextView = view.findViewById(R.id.titlePic)
        var textView1 : TextView = view.findViewById(R.id.descPic)


        var person : Model = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(person.photo))
        textView.text = person.title
        textView1.text = person.desc


        return view
    }

}