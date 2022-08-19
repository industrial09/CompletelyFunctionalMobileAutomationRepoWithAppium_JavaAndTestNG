package framework.base;

import framework.utilities.ExcelUtility;

public class Utilities {
    public static ExcelUtility getExcelData(){
        ExcelUtility util=null;
        try {
             util = new ExcelUtility();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return util;
    }
}
