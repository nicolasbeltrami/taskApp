package com.nico.taskapp.ui.list

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nico.taskapp.model.Task

class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}

class TaskAdapter() : ListAdapter<Task, TaskViewHolder>(DIFF_CONFIG) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        TODO("Not yet implemented")
    }



}