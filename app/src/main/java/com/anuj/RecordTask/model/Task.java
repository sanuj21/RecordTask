package com.anuj.RecordTask.model;


import androidx.annotation.NonNull;

public class Task {
    private int taskId;
    private String taskTitle;
    private String taskDescription;
    private String taskPriority;
    private String date;
    private String time;
    private int status;

    public Task() {

    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Task(String taskTitle, String taskDescription, String date, int status) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.date = date;
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        if(taskDescription == null) taskDescription = "None";
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @NonNull
    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskTitle='" + taskTitle + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", date='" + date + '\'' +
                ", time='" +time +'\'' +
                ", status=" + status +
                '}';
    }
}
