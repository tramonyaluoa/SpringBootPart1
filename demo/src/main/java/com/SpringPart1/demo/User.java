package com.SpringPart1.demo;
import com.SpringPart1.demo.*;

public class User {
    private int Id;
    private String name;
    private String surname;

    public User(int Identity, String Name, String Surname){
        this.Id = Identity;
        this.name = Name;
        this.surname = Surname;
    }

    public int getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}