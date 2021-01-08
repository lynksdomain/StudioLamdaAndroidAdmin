package com.example.studiolamdaadmin

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.project_item.view.*

class ProjectAdapter(val items : ArrayList<ProjectItem>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.project_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentProject = items[position]
        holder?.projectName?.text = currentProject.name
    }

    override fun getItemCount(): Int {
        return items.size
    }

}


class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val projectName = view.project_name
}