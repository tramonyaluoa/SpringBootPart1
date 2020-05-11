package com.SpringPart1.demo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements FakeRepoInterface, UserService {

    //inject dependency
    @Autowired
    private FakeRepo fakeRepo;
    @Override
    public String addUser(int Id, String name, String surname) {
        fakeRepo = new FakeRepo ();                                 //inserts user
        return fakeRepo.insertUser(Id, name, surname);
    }
    @Override
    public String removeUser(int Id) {
        fakeRepo = new FakeRepo ();                                //removes user by ID
        return fakeRepo.deleteUser(Id);
    }
    @Override
    public String getUser(int Id) {
        fakeRepo = new FakeRepo ();                               // Finds user by ID
        return fakeRepo.findUserById(Id);
    }

    @Override
    public String insertUser(int id, String name, String surname) {
        return null;
    }

    @Override
    public String deleteUser(int Id) {
        return null;
    }

    @Override
    public String findUserById(int Id) {
        return null;
    }
}