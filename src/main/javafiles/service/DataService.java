
package javafiles.service;
import javafiles.data.User;

import java.util.List;

public interface DataService{

    void createUser(String firstName, String lastName, String patronymic);
    List<User> getAll();
    void deleteUser(Long id);

}