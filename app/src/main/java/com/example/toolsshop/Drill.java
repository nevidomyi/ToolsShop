package com.example.toolsshop;

public class Drill {
    private String title;
    private String info;
    private int imgResource;

    public Drill(String title, String info, int imgResource) {
        this.title = title;
        this.info = info;
        this.imgResource = imgResource;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImgResource() {
        return imgResource;
    }

    @Override
    public String toString() {
        return title;
    }
}
