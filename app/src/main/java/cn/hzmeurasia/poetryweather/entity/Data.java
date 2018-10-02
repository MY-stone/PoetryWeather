package cn.hzmeurasia.poetryweather.entity;

import com.google.gson.annotations.SerializedName;

/**
 * 类名: Data<br>
 * 功能:(TODO用一句话描述该类的功能)<br>
 * 作者:黄振敏 <br>
 * 日期:2018/10/1 15:31
 */
public class Data {
    @SerializedName("date")
    private String today;
    @SerializedName("suit")
    private String suit;
    @SerializedName("avoid")
    private String avoid;

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getAvoid() {
        return avoid;
    }

    public void setAvoid(String avoid) {
        this.avoid = avoid;
    }
}
