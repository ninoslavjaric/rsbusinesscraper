package pojo;

import java.io.Serializable;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class City implements Serializable {
    private int Value;
    private String DisplayText;

    public City(int value, String displayText) {
        Value = value;
        DisplayText = displayText;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public String getDisplayText() {
        return DisplayText;
    }

    public void setDisplayText(String displayText) {
        DisplayText = displayText;
    }
    //    public static ArrayList<City> proccess(ArrayList<LinkedTreeMap>){
//        return null;
//    }
}
