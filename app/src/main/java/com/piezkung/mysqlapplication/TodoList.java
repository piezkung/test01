package com.piezkung.mysqlapplication;

import java.io.Serializable;

/**
 * Created by lenovoNB on 10-Feb-17.
 */

public class TodoList implements Serializable {
    public int taskid;
    public String taskname;

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

}
