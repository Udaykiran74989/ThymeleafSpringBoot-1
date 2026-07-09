//package com.TeambrainTech.Service;
//
//import java.util.List;
//
//import org.apache.catalina.User;
//
//import com.TeambrainTech.Entity.Users;
//
//public interface Service {
//Users saveUser(User users);
//
//
//List<Users> getAllUsers();
//
//
//Users saveUser(Users users);
//
//
//
//}
package com.TeambrainTech.Service;

import java.util.List;

import com.TeambrainTech.Entity.Users;

public interface Service {

    Users saveUser(Users users);

    List<Users> getAllUsers();
   
    
    void deleteUsers(Long id);
    Users getUserById(Long id);
}
