package GSONAnnotation.EX1;


import GSONAnnotation.EX1.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class GsonAnnotationExample {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        Person person = new Person("John","Parki","180","80","Dark","White","Blue");

        //serialization
        String personJson = gson.toJson(person);
        System.out.println("Serialization: ");
        System.out.println(personJson);

        //deserialization
        Person person1 = gson.fromJson(personJson,Person.class);
        System.out.println("Deserialization: ");
        System.out.println(person1);



    }
}
