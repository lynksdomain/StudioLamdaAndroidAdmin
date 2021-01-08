package com.example.studiolamdaadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_project.*

class ProjectActivity : AppCompatActivity() {

    val projects: ArrayList<ProjectItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)
        projects.add(ProjectItem("Rest","things"))
        project_list.layoutManager = LinearLayoutManager(this)
        project_list.adapter = ProjectAdapter(projects ,this)

    }
}