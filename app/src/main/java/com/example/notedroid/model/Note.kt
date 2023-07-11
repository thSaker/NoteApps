package com.example.notedroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Note(

    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    val title: String,
    val content: String,
    val date: String,
    val color: Int = -1,

    ) : Serializable //Serializable đảm bảo rằng các trường dữ liệu của đối tượng Note cũng được tuần tự hóa và lưu trữ

