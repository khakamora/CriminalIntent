package com.example.default_user.criminalintent;

import java.util.UUID;

/**
 * Created by default-user on 01.12.2015.
 */
public class Crime {
    private UUID id;
    private String title;

    public Crime(){
        id = UUID.randomUUID();
    }

    public UUID getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
