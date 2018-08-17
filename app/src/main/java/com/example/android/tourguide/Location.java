package com.example.android.tourguide;

public class Location {
    private String name;
    private String address;
    private String hours;
    private int imageResourceId = NO_IMG_PROVIDED;

    // set init img resource id to one that cannot be gotten
    private static final int NO_IMG_PROVIDED = -1;

    /**
     * Create location object with no img
     * @param nName name of location
     * @param nAddress address of location
     * @param nHours operating hours of location
     */
    public Location(String nName, String nAddress, String nHours) {
        name = nName;
        address = nAddress;
        hours = nHours;
    }

    /**
     * Create location object with img
     * @param nName name of location
     * @param nAddress address of location
     * @param nHours operating hours of location
     * @param nImageResourceId the resource id of the img
     */
    public Location(String nName, String nAddress, String nHours, int nImageResourceId) {
        name = nName;
        address = nAddress;
        hours = nHours;
        imageResourceId = nImageResourceId;
    }

    /**
     * name of location
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * address of location
     * @return String
     */
    public String getAddress() {
        return address;
    }

    /**
     * operating hours of location
     * @return String
     */
    public String getHours() {
        return hours;
    }

    /**
     * img resource id of location
     * @return int
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * If the location has an image return true
     * @return boolean
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMG_PROVIDED;
    }
}
