package com.example.sophie.camtour;


/**
 * Created by Sophie on 2/2/2017.
 */

public class Heritage {

    private int nameID;
    private int descriptionID;
    private int addressID;
    private int imageID=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    public Heritage(int nameID, int descriptionID,int addressID, int imageID){
        this.nameID= nameID;
        this.descriptionID=descriptionID;
        this.addressID=addressID;
        this.imageID=imageID;
    }
    public Heritage (int nameID, int descriptionID){
        this.nameID=nameID;
        this.descriptionID=descriptionID;
    }

    public int getNameID() {
        return nameID;
    }

    public int getDescriptionID() {
        return descriptionID;
    }

    public int getAddressID(){return addressID;}

    public int getImageID(){return imageID;}

    public boolean hasImage(){return imageID!=NO_IMAGE_PROVIDED;}

}
