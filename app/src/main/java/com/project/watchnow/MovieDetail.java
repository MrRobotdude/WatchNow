package com.project.watchnow;

import java.util.ArrayList;

public class MovieDetail {

    public MovieDetail(String id, String title, String fullTitle, String year, String releaseState,
                       String image, String runtimeMins, String runtimeStr, String plot,
                       String contentRating, String IMDbRating, String IMDbRatingCount,
                       String metacriticRating, String genres,
                       String directors, String stars) {
        Id = id;
        Title = title;
        FullTitle = fullTitle;
        Year = year;
        ReleaseState = releaseState;
        Image = image;
        RuntimeMins = runtimeMins;
        RuntimeStr = runtimeStr;
        Plot = plot;
        ContentRating = contentRating;
        this.IMDbRating = IMDbRating;
        this.IMDbRatingCount = IMDbRatingCount;
        MetacriticRating = metacriticRating;
        Genres = genres;
        Directors = directors;
        Stars = stars;
    }

    private String Id;
    private String Title;
    private String FullTitle;
    private String Year;
    private String ReleaseState;
    private String Image;
    private String RuntimeMins;
    private String RuntimeStr;
    private String Plot;
    private String ContentRating;
    private String IMDbRating;
    private String IMDbRatingCount;
    private String MetacriticRating;
    private String Genres;
    private String Directors;
    private String Stars;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFullTitle() {
        return FullTitle;
    }

    public void setFullTitle(String fullTitle) {
        FullTitle = fullTitle;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getReleaseState() {
        return ReleaseState;
    }

    public void setReleaseState(String releaseState) {
        ReleaseState = releaseState;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getRuntimeMins() {
        return RuntimeMins;
    }

    public void setRuntimeMins(String runtimeMins) {
        RuntimeMins = runtimeMins;
    }

    public String getRuntimeStr() {
        return RuntimeStr;
    }

    public void setRuntimeStr(String runtimeStr) {
        RuntimeStr = runtimeStr;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }

    public String getContentRating() {
        return ContentRating;
    }

    public void setContentRating(String contentRating) {
        ContentRating = contentRating;
    }

    public String getIMDbRating() {
        return IMDbRating;
    }

    public void setIMDbRating(String IMDbRating) {
        this.IMDbRating = IMDbRating;
    }

    public String getIMDbRatingCount() {
        return IMDbRatingCount;
    }

    public void setIMDbRatingCount(String IMDbRatingCount) {
        this.IMDbRatingCount = IMDbRatingCount;
    }

    public String getMetacriticRating() {
        return MetacriticRating;
    }

    public void setMetacriticRating(String metacriticRating) {
        MetacriticRating = metacriticRating;
    }

    public String getGenres() {
        return Genres;
    }

    public void setGenres(String genres) {
        Genres = genres;
    }

    public String getDirectors() {
        return Directors;
    }

    public void setDirectors(String directors) {
        Directors = directors;
    }

    public String getStars() {
        return Stars;
    }

    public void setStars(String stars) {
        Stars = stars;
    }

}
