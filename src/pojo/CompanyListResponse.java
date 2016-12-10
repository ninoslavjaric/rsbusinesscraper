package pojo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class CompanyListResponse implements Serializable {
    private String Result;
    private ArrayList<Company> Records;
    private int TotalRecordCount;

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public ArrayList<Company> getRecords() {
        return Records;
    }

    public void setRecords(ArrayList<Company> records) {
        Records = records;
    }

    public int getTotalRecordCount() {
        return TotalRecordCount;
    }

    public void setTotalRecordCount(int totalRecordCount) {
        TotalRecordCount = totalRecordCount;
    }
}
