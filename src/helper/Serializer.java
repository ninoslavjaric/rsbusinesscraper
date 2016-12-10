package helper;

import java.io.*;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class Serializer {
    public static void serialize(Object o, String path) throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
    }
    public static Object unserialize(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream(path));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }
}
