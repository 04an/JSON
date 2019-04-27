package GSONAnnotation.EX1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Person {

    @Expose
    @SerializedName("name")
    private String fullName;
    @Expose
    private String height;
    @Expose
    @SerializedName("mass")
    private String weight;
    @Expose
    @SerializedName("hair_color")
    private String hairColor;
    @Expose
    @SerializedName("skin_color")
    private String skinColor;
    @Expose
    @SerializedName("eye_color")
    private String eyeColor;
    @Expose
    @SerializedName("birth_year")
    private String dataOfBirth;
    
    private String additionalInfo ="none";
    private int timeStamp = 13;

    @Expose
    private String gender;
    @Expose
    String [] species;
    @Expose
    String []  vechicles;
    @Expose
    String url;

    public Person(String fullName, String height, String weight, String hairColor, String skinColor, String eyeColor, String dataOfBirth) {
        this.fullName = fullName;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.dataOfBirth = dataOfBirth;

    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Annotation.Person{" +
                "fullName='" + fullName + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", timeStamp=" + timeStamp +
                ", gender='" + gender + '\'' +
                ", species=" + Arrays.toString(species) +
                ", vechicles=" + Arrays.toString(vechicles) +
                ", url='" + url + '\'' +
                '}';
    }
}
