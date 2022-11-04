package com.example.imageapi;

public class Item {
    String imageurl, tags;
    int likes;

    public Item(String imageurl, String tags, int likes) {
        this.imageurl = imageurl;
        this.tags = tags;
        this.likes = likes;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
