package com.example.student

interface OnItemClickListener {
    fun onEditClick(position: Int, students : MutableList<StudentModel>)
    fun onRemoveClick(position: Int,students: MutableList<StudentModel>)
}