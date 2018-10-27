package com.example.akhilbatchu.makearecipe;

import com.google.gson.annotations.SerializedName;

public class userrepo {
    @SerializedName("name")
    private String name;

    public String getName()
    {
        return name;
    }
}
