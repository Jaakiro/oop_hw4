package org.example.hw4;

import java.util.List;

public interface UserService <T>{
    List<T> getAll();
    void create(String firstName, String secondName, String lastName);
}
