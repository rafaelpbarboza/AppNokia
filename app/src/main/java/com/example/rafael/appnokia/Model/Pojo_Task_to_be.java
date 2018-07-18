package com.example.rafael.appnokia.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pojo_Task_to_be implements Parcelable {
    private String name;
    private String status;
    private String date;
    private int activity;
    private int day_working;
    private int progress;

    public Pojo_Task_to_be() {
    }

    public Pojo_Task_to_be(String name, String status, String date, int activity, int day_working, int progress) {
        this.name = name;
        this.status = status;
        this.date = date;
        this.activity = activity;
        this.day_working = day_working;
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public int getDay_working() {
        return day_working;
    }

    public void setDay_working(int day_working) {
        this.day_working = day_working;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    protected Pojo_Task_to_be(Parcel in) {
        name = in.readString();
        status = in.readString();
        date = in.readString();
        activity = in.readInt();
        day_working = in.readInt();
        progress = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(status);
        dest.writeString(date);
        dest.writeInt(activity);
        dest.writeInt(day_working);
        dest.writeInt(progress);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Pojo_Task_to_be> CREATOR = new Parcelable.Creator<Pojo_Task_to_be>() {
        @Override
        public Pojo_Task_to_be createFromParcel(Parcel in) {
            return new Pojo_Task_to_be(in);
        }

        @Override
        public Pojo_Task_to_be[] newArray(int size) {
            return new Pojo_Task_to_be[size];
        }
    };
}