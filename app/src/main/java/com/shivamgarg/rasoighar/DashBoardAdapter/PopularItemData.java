package com.shivamgarg.rasoighar.DashBoardAdapter;

public class PopularItemData {
    private int relativeView;
    private String textView;
    public PopularItemData(int relativeView, String textView){
        this.relativeView=relativeView;
        this.textView=textView;
    }

    public int getRelativeView() {
        return relativeView;
    }

    public String getTextView() {
        return textView;
    }
}
