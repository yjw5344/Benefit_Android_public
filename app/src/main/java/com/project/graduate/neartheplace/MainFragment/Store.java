package com.project.graduate.neartheplace.MainFragment;

public class Store {

    private String company;
    private String branch;
    private String address;
    private String telephone;
    private String category;
    private String imgSrc;
    private Double latitude;
    private Double longitude;

    public Store(String company, String branch, String address, String telephone, String category, String imgSrc, Double latitude, Double longitude) {
        this.company = company;
        this.branch = branch;
        this.address = address;
        this.telephone = telephone;
        this.category = category;
        this.imgSrc = imgSrc;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
