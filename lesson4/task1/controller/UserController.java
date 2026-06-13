
package lesson4.task1.controller;

import lesson4.task1.data.User;

public interface UserController <T extends User> {

    void create(String firstName,String middleName, String lastName);
    
}