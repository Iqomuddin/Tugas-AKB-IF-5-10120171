package com.App10120171;

import android.database.Cursor;

import com.App10120171.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

