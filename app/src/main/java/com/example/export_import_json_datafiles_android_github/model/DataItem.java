package com.example.export_import_json_datafiles_android_github.model;

import android.content.ContentValues;

import java.util.UUID;

public class DataItem {
    private String itemId;
    private String artistImage;
    private String songName;
    private String artistName;
    private String artistGenre;
    private double songPrice;

    public DataItem(){}

    public DataItem(String itemId, String artistImage, String songName, String artistName, String artistGenre, double songPrice) {

        if(itemId == null){
            itemId = UUID.randomUUID().toString();
        }

        this.itemId = itemId;
        this.artistImage = artistImage;
        this.songName = songName;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
        this.songPrice = songPrice;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getArtistImage() {
        return artistImage;
    }

    public void setArtistImage(String artistImage) {
        this.artistImage = artistImage;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }

    public void setArtistGenre(String artistGenre) {
        this.artistGenre = artistGenre;
    }

    public double getSongPrice() {
        return songPrice;
    }

    public void setSongPrice(double songPrice) {
        this.songPrice = songPrice;
    }


    @Override
    public String toString() {
        return "DataItem{" +
                "itemId='" + itemId + '\'' +
                ", artistImage='" + artistImage + '\'' +
                ", songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", artistGenre='" + artistGenre + '\'' +
                ", songPrice=" + songPrice +
                '}';
    }
}
