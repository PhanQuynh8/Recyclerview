package com.example.recycleview_buoi5;

public class MyItem {
    private int imageResId;
    private String title;
    private String text;


    public MyItem(int imageResId, String title, String text) {
        this.imageResId = imageResId;
        this.title = title;
        this.text = text;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
