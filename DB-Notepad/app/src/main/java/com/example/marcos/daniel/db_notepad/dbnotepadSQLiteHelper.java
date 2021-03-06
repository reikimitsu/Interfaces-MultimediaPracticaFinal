package com.example.marcos.daniel.db_notepad;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class dbnotepadSQLiteHelper extends SQLiteOpenHelper {

    // SQL query for create table
    String sqlCreate = "CREATE TABLE IF NOT EXISTS notepad (code INTEGER PRIMARY KEY AUTOINCREMENT, content TEXT)";

    public dbnotepadSQLiteHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Launch SQL query for create the table
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
        /* Possible update of the app
         * TODO Create new table
         * TODO Migrate data
         * TODO Delete old table
         */
    }
}

