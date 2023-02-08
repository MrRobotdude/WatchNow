package com.project.watchnow;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    public Movie(ArrayList<MovieDetail> items, String errorMessage) {
        Items = items;
        ErrorMessage = errorMessage;
    }

    private ArrayList<MovieDetail> Items;

    private String ErrorMessage;

    public ArrayList<MovieDetail> getItems() {
        return Items;
    }

    public void setItems(ArrayList<MovieDetail> items) {
        Items = items;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}

