package GSON;

import com.google.gson.Gson;

import java.util.Arrays;

public class GsonUsageExample {
    public static void main(String[] args) {
        //Gson creation
        Gson gson = new Gson();


//        //serialization
//        GSON.User user = new GSON.User("Jan", "Kowalski", 54);
//        String userJson = gson.toJson(user);
//        System.out.println("Serialization:");
//        System.out.println(userJson);
//
//        //deserialization
//        GSON.User user1 = gson.fromJson(userJson, GSON.User.class);
//        System.out.println("Deserialization:");
//        System.out.println(user1);

        //serialization
        User[] users = {
                new User("Jan", "Kowalski", 53),
                new User("Miro", "Lilipan", 24)};

        String usersJSON = gson.toJson(users);
        System.out.println("Serialization:");
        System.out.println(usersJSON);

        //deserialization
        User[] userCollection = gson.fromJson(usersJSON, User[].class);
        System.out.println("Collection Deserialization:");
        System.out.println(Arrays.toString(userCollection));
    }
}

