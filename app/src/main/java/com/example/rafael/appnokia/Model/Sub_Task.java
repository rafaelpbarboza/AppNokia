package com.example.rafael.appnokia.Model;

public class Sub_Task {
    private String title,image;
    private int progress;



    public Sub_Task() {
    }

    public Sub_Task(String title, String image, int progress) {
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
}
