package com.example.jetnote.repository

import com.example.jetnote.model.Note
import com.example.jetnote.model.NoteDatabaseDao
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDatabaseDao: NoteDatabaseDao) {

    suspend fun addNote(note: Note) = noteDatabaseDao.insert(note)
    suspend fun updateNote(note: Note) = noteDatabaseDao.update(note)
    suspend fun deleteNote(note: Note) = noteDatabaseDao.deleteNote(note)
    suspend fun deleteAllNotes() = noteDatabaseDao.deleteAll()
    suspend fun getAllNotes() = noteDatabaseDao.getNotes()
}