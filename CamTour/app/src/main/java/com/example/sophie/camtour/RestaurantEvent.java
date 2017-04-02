package com.example.sophie.camtour;

/**
 * Created by Sophie on 2/2/2017.
 */

public class RestaurantEvent {

    private int nameID;
    private int categoryID=NO_CATEGORY_PROVIDED;
    private int descriptionID;
    private int imageID=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private static final int NO_CATEGORY_PROVIDED=-1;
    public RestaurantEvent(int nameID, int categoryID, int descriptionID, int imageID){
        this.nameID= nameID;
        this.categoryID=categoryID;
        this.descriptionID=descriptionID;
        this.imageID=imageID;
    }
    public RestaurantEvent(int nameID, int descriptionID, int imageID){
        this.nameID= nameID;
        this.descriptionID=descriptionID;
        this.imageID=imageID;
    }
    public RestaurantEvent(int nameID, int descriptionID){
        this.nameID= nameID;
        this.descriptionID=descriptionID;
    }
    public int getNameID() {
        return nameID;
    }

    public int getCategoryID() {
            return categoryID;
    }

    public boolean hasCategory(){return categoryID!=NO_CATEGORY_PROVIDED;}

    public int getDescriptionID(){return  descriptionID;}

    public int getImageID(){return imageID;}

    public boolean hasImage(){return imageID!=NO_IMAGE_PROVIDED;}

}
