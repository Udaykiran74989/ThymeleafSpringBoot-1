package com.TeambrainTech.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TeambrainTech.Entity.Users;

public interface UserRepo extends JpaRepository<Users, Long> {

}
