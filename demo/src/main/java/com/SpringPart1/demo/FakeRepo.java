package com.SpringPart1.demo;
import com.SpringPart1.demo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {
    @Autowired
        static ArrayList<User> users = new ArrayList<>();

    @Override
    public String insertUser(int id, String name, String surname){
        users.add(new User(id, name, surname));
        return name + " " + surname + " Was Successfully Entered";
    }

    @Override
    public String findUserById(int Id) {
        for(User user:users){
            long userId = user.getId();
            if(userId == Id){
                return "Hello "+user.getName();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(int Id) {
        for (User user:users){
            long userId = user.getId();
            if(userId == Id){
                users.remove(user);
                return user.getName()+" " + user.getSurname () +" Was Successfully Removed";
            }
        }
        return null;
    }
}