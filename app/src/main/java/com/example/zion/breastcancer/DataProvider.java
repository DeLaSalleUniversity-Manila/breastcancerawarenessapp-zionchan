package com.example.zion.breastcancer;

/**
 * Created by Zion on 10/11/2015.
 */
public class DataProvider {
    private int photoResource;
    private String names;

    public DataProvider(int photoResource, String names){
        this.setNames(names);
        this.setPhotoResource(photoResource);
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getPhotoResource() {
        return photoResource;
    }

    public void setPhotoResource(int photoResource) {
        this.photoResource = photoResource;
    }
}
