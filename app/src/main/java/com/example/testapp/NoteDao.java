package com.example.testapp;

import android.provider.SyncStateContract;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM user")
    List<Note> getAll();

    @Insert
    void insert(Note note);

    /*
     * update the object in database
     * @param note, object to be updated
     */
    @Update
    void update(Note repos);

    /*
     * delete the object from database
     * @param note, object to be deleted
     */
    @Delete
    void delete(Note note);

    /*
     * delete list of objects from database
     * @param note, array of objects to be deleted
     */
    @Delete
    void delete(Note... note);      // Note... is varargs, here note is an array

}
