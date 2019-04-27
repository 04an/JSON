package GSONAnnotation.EX2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car {

    @Expose
    @SerializedName("carName")
    public String name;

    @Expose(serialize = false, deserialize = false)
    public String type;

    public String color;

    public Car(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
