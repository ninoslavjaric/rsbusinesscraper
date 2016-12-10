import helper.Log;
import helper.Serializer;
import pojo.City;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class TestMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<City> cities = (ArrayList<City>) Serializer.unserialize("cache/cities.ser");
        Log.prntl(cities);
    }
}
