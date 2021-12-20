package com.example.cinemadb.Models;

public class Cast {
    String actor="";
    String actor_id="";
    String character="";

    public Cast(String actor, String actor_id, String character) {
        this.actor = actor;
        this.actor_id = actor_id;
        this.character = character;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActor_id() {
        return actor_id;
    }

    public void setActor_id(String actor_id) {
        this.actor_id = actor_id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
