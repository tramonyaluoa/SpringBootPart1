package com.SpringPart1.demo;
import com.SpringPart1.demo.*;


public interface FakeRepoInterface {

    String insertUser(int id, String name, String surname);
    String deleteUser(int Id);
    String findUserById(int Id);
}