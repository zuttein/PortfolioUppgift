package com.example.portfoliouppgift

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

//Inherits from BaseAdapter
class PersonalAdapter(context: Context, data: List<DataKlass>) : BaseAdapter() {
    // Context and data list variables
    private val mContext: Context = context
    private val mData: List<DataKlass> = data

    // Returns the total number of items in the data list
    override fun getCount(): Int {
        return mData.size
    }
    // Returns the data object at the specified position
    override fun getItem(position: Int): Any {
        return mData[position]
    }
    // Returns the item ID for the specified position
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    // Inflates the layout for each item in the data list and sets the content
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // Retrieves the data object at the specified position
        val item = mData[position]

        // Inflates the layout for the adapter
        val inflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = inflater.inflate(R.layout.personal_adapter, parent, false)

        // Retrieves the TextViews and ImageView from the inflated layout
        val textView1 = itemView.findViewById(R.id.tv_project) as TextView
        val textView2 = itemView.findViewById(R.id.tv_content) as TextView
        val imageView = itemView.findViewById(R.id.iv_picture) as ImageView

        // Sets the content of TextViews and ImageView based on the data object
        textView1.text = item.projectname
        textView2.text = item.content
        imageView.setImageResource(item.imageResId)

        return itemView
    }
}