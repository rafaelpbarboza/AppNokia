package com.example.rafael.appnokia.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Pojo_Task implements Parcelable {
    private String site;
    private String address;
    private int status;
    private int activities;
    private ArrayList<Pojo_Sub_Task> pojoSub_tasks;

    public Pojo_Task() {
    }

    public Pojo_Task(String site, String address, int activities, int status, ArrayList<Pojo_Sub_Task> pojoSub_task) {
        this.site = site;
        this.address = address;
        this.activities = activities;
        this.status = status;
        this.pojoSub_tasks = pojoSub_task;
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

    public ArrayList<Pojo_Sub_Task> getPojoSub_tasks() {
        return pojoSub_tasks;
    }

    public void setPojoSub_tasks(ArrayList<Pojo_Sub_Task> pojoSub_tasks) {
        this.pojoSub_tasks = pojoSub_tasks;
    }

    protected Pojo_Task(Parcel in) {
        site = in.readString();
        address = in.readString();
        status = in.readInt();
        activities = in.readInt();
        if (in.readByte() == 0x01) {
            pojoSub_tasks = new ArrayList<Pojo_Sub_Task>();
            in.readList(pojoSub_tasks, Pojo_Sub_Task.class.getClassLoader());
        } else {
            pojoSub_tasks = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(site);
        dest.writeString(address);
        dest.writeInt(status);
        dest.writeInt(activities);
        if (pojoSub_tasks == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(pojoSub_tasks);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Pojo_Task> CREATOR = new Parcelable.Creator<Pojo_Task>() {
        @Override
        public Pojo_Task createFromParcel(Parcel in) {
            return new Pojo_Task(in);
        }

        @Override
        public Pojo_Task[] newArray(int size) {
            return new Pojo_Task[size];
        }
    };
}
