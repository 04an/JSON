package GSONAnnotation.EX2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonAnnotationsExample {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = gsonBuilder.create();
        Car car = new Car("Audi","suv","White");

        //serialization
        String carJson = gson.toJson(car);
        System.out.println("Serialization: ");
        System.out.println(carJson);

        //deserialization
        Car car1 = gson.fromJson(carJson, Car.class);
        System.out.println("Deserialization: ");
        System.out.println(car1);
    }
}
