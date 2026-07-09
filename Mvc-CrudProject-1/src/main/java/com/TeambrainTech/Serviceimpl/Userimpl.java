package com.TeambrainTech.Serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.TeambrainTech.Entity.Users;
import com.TeambrainTech.Repo.UserRepo;
import com.TeambrainTech.Service.Service;

@org.springframework.stereotype.Service
public class Userimpl implements Service {

    @Autowired
    private UserRepo repo;

    @Override
    public Users saveUser(Users users) {
        return repo.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        List<Users> userslist =repo.findAll();
        return userslist;
        
    }

    @Override
    public void deleteUsers(Long id) {
  repo.deleteById(id);
    }

	@Override
	public Users getUserById(Long id) {
	Users user = repo.findById(id).orElse(null);
		
		return user;
	}
    
    
    
}