package com.example.rafael.appnokia.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Pojo_Sub_Task implements Parcelable {
    private String title;
    private String image;
    private int progress;
    private ArrayList<Pojo_Task_to_be> pojo_task_to_bes;

    public Pojo_Sub_Task() {
    }

    public Pojo_Sub_Task(String title, String image, int progress,ArrayList<Pojo_Task_to_be>pojo_task_to_bes) {
        this.title = title;
        this.image = image;
        this.progress = progress;
        this.pojo_task_to_bes=pojo_task_to_bes;
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

    public ArrayList<Pojo_Task_to_be> getPojo_task_to_bes() {
        return pojo_task_to_bes;
    }

    public void setPojo_task_to_bes(ArrayList<Pojo_Task_to_be> pojo_task_to_bes) {
        this.pojo_task_to_bes = pojo_task_to_bes;
    }

    protected Pojo_Sub_Task(Parcel in) {
        title = in.readString();
        image = in.readString();
        progress = in.readInt();
        if (in.readByte() == 0x01) {
            pojo_task_to_bes = new ArrayList<Pojo_Task_to_be>();
            in.readList(pojo_task_to_bes, Pojo_Task_to_be.class.getClassLoader());
        } else {
            pojo_task_to_bes = null;
        }
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
        if (pojo_task_to_bes == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(pojo_task_to_bes);
        }
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