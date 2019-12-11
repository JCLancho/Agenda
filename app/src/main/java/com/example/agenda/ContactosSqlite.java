package com.example.agenda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ContactosSqlite extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABLE Contacto (nombre TEXT PRIMARY KEY, telefono TEXT)";

    public ContactosSqlite(Context contexto, String nombre,
                           SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
