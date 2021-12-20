package com.example.cinemadb.Models;

import java.util.List;

public class DetailApiResponse {
     String id="";
     String title="";
     String year="";
     String length="";
     String rating="";
     String rating_votes="";
     String poster="";
     String plot="";
    Trailer trailer;
    List < Cast > cast ;
    List < List<String> > technical_specs;

    public List<Cast> getCast() {
        return cast;
    }

    public List<List<String>> getTechnical_specs() {
        return technical_specs;
    }

// Getter Methods

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getLength() {
        return length;
    }

    public String getRating() {
        return rating;
    }

    public String getRating_votes() {
        return rating_votes;
    }

    public String getPoster() {
        return poster;
    }

    public String getPlot() {
        return plot;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setRating_votes(String rating_votes) {
        this.rating_votes = rating_votes;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public void setTrailer(Trailer trailerObject) {
        this.trailer = trailerObject;
    }
}

