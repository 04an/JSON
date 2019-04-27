package GSON;

import com.google.gson.annotations.SerializedName;

public class User {
    public String name;
    @SerializedName("Last_name")
    public String lastName;
    @SerializedName("How_old_you")//always needed in case of serialization/deserialization
    public int age;

    public User() {
    }
    public User(String name, String lastName, int age){
        this.age=age;
        this.lastName =lastName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "GSON.User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
