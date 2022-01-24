package com.example.lesson34android2;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;



import java.util.List;

@Dao
public interface TaskDao {
    @Insert
    void insert(TaskModel taskModel);

    @Delete
    void delete(TaskModel model);

    @Query("SELECT * FROM task_model")
    LiveData<List<TaskModel>> getData();
}
