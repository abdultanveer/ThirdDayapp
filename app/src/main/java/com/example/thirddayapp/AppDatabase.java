package com.example.thirddayapp;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Person.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase{

    public abstract PersonDao personDao();


    private static final String LOG_TAG = AppDatabase.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "personlist";
    private static AppDatabase sInstance;

    public static AppDatabase getInstance(Context context) {
        sInstance = Room.databaseBuilder(context,AppDatabase.class,DATABASE_NAME).build();
        return sInstance;
    }
    }
