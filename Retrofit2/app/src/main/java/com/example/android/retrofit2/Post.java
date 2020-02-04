package com.example.android.retrofit2;

/**
 * Created by Hakimi on 4/2/2020.
 */
public class Post {

    private int userId;
    private int id;
    private String title;
    private String text;

    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
