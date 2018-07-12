package com.example.rafael.appnokia.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pojo_Sub_Task implements Parcelable {
    private String title;
    private String image;
    private int progress;

    public Pojo_Sub_Task() {
    }

    public Pojo_Sub_Task(String title, String image, int progress) {
        this.title = title;
        this.image = image;
        this.progress = progress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    protected Pojo_Sub_Task(Parcel in) {
        title = in.readString();
        image = in.readString();
        progress = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(image);
        dest.writeInt(progress);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Pojo_Sub_Task> CREATOR = new Parcelable.Creator<Pojo_Sub_Task>() {
        @Override
        public Pojo_Sub_Task createFromParcel(Parcel in) {
            return new Pojo_Sub_Task(in);
        }

        @Override
        public Pojo_Sub_Task[] newArray(int size) {
            return new Pojo_Sub_Task[size];
        }
    };
}