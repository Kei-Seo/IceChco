package com.example.icechco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter (val context: Context, val UserList: ArrayList<User>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.itme_user, null)
        val Subgroup = view.findViewById<TextView>(R.id.subgroup_tv)
        val Clubname = view.findViewById<TextView>(R.id.Clubname_tv)
        val Mansize = view.findViewById<TextView>(R.id.mansize_tv)
        val Content = view.findViewById<TextView>(R.id.contentclub_tv)

        val user = UserList[position]

        Subgroup.text = user.subgroup
        Clubname.text = user.clubname
        Mansize.text = user.mansize
        Content.text = user.contentclub
        return view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return UserList.size
    }
}