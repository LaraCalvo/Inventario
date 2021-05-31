package com.mc.inventario.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.mc.inventario.data.ItemDatabaseContract.ItemDatabaseEntry;

import androidx.annotation.Nullable;

public class ItemDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "inventario.db";
    private static final int DATABASE_VERSION = 1;
    public ItemDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ITEMS_TABLE =  "CREATE TABLE " + ItemDatabaseEntry.TABLE_NAME + " ("
                + ItemDatabaseEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ItemDatabaseEntry.COLUMN_ITEM_NAME + " TEXT NOT NULL, "
                + ItemDatabaseEntry.COLUMN_ITEM_QUANTITY + " TEXT NOT NULL); ";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
