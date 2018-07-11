package com.example.rafael.appnokia.Model;

import java.util.ArrayList;

public class Task {
    private String site,address;
    private int status,activities;
    private ArrayList<Sub_Task> sub_tasks;

    public Task() {
    }

    public Task(String site, String address, int activities, int status,ArrayList<Sub_Task>sub_task) {
        this.site = site;
        this.address = address;
        this.activities = activities;
        this.status = status;
        this.sub_tasks=sub_task;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getActivities() {
        return activities;
    }

    public void setActivities(int activities) {
        this.activities = activities;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Sub_Task> getSub_tasks() {
        return sub_tasks;
    }

    public void setSub_tasks(ArrayList<Sub_Task> sub_tasks) {
        this.sub_tasks = sub_tasks;
    }
}
