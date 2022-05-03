package com.shivamgarg.rasoighar.DashBoardAdapter;

public class FeaturedRestaurantsData {
    private int imageView;
    private String textView;
    public FeaturedRestaurantsData(int imageView, String textView){
        this.imageView=imageView;
        this.textView=textView;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTextView() {
        return textView;
    }
}
