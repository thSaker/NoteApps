package com.example.notedroid.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notedroid.model.Note


@Dao
interface DAO {

    //phương thức thêm note
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addNote(note: Note)

    //phương thức update
    @Update
    suspend fun updateNote(note: Note)

    //phương thức lấy tất cả dữ liệu
    @Query("SELECT * FROM Note ORDER BY id DESC")
    fun getAllNote(): LiveData<List<Note>>

    //phương thức tìm kiếm
    @Query("SELECT * FROM Note WHERE title LIKE :query OR content LIKE :query OR date LIKE :query ORDER BY id DESC")
    fun searchNotes(query: String): LiveData<List<Note>>

    //phương thức xoá
    @Delete
    suspend fun deleteNote(note: Note)
}