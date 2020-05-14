package DataLayer;

import BusinessLayer.Restaurant;

import java.io.*;

public class RestaurantSerializator {
    public static void serialize(Restaurant r, String fileName) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(r);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Restaurant deserialize(String fileName) {
        FileInputStream fileInputStream = null;
        Restaurant r = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            r = (Restaurant) objectInputStream.readObject();
            objectInputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return r;
    }
}
