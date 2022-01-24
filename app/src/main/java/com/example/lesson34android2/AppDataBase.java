package com.example.lesson34android2;

import androidx.room.Database;
import androidx.room.RoomDatabase;



@Database(entities = {TaskModel.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
