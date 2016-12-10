package helper;

import pojo.Company;

import java.util.ArrayList;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class Log {
    public static void prnt(Object o){
        System.out.print(o);
    }
    public static void prntl(Object o){
        System.out.println(o);
    }
    public static void prntl(){
        System.out.println();
    }
    public static void die(){
        System.exit(0);
    }
    public static void dd(Object o){
        prntl(o);
        die();
    }
}
