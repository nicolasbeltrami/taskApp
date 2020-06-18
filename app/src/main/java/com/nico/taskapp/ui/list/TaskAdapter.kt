package com.nico.taskapp.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nico.taskapp.R
import com.nico.taskapp.model.Task

class TaskAdapter(private val onClickListener: OnClickListener) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){
    private var listTask = ArrayList<Task>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(itemView)
    }

    override fun getItemCount() = listTask.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = listTask[position]
        holder.apply {
            tvTaskName.text = task.name
            cbTask.isChecked = task.isCompleted
        }
    }

    fun updateData(data: List<Task>) {
        listTask.clear()
        listTask.addAll(data)
        notifyDataSetChanged()
    }

    class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTaskName: TextView = view.findViewById(R.id.tvTitleName)
        val cbTask: CheckBox = view.findViewById(R.id.cbTaskCompleted)
    }

    class OnClickListener(val clickListener: (task: Task) -> Unit){
        fun onClick(task: Task) = clickListener(task)
    }
}
