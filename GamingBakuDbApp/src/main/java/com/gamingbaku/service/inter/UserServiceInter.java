package com.gamingbaku.service.inter;

import com.gamingbaku.entity.User;

import java.util.List;

public interface UserServiceInter {

    public List<User> getAll(String name, String surname);

    public User findByEmailAndPassword(String email, String password);
    
    public User findByEmail(String email);

    public User getById(int id);

    public boolean addUser(User u);

    public boolean updateUser(User u);

    public boolean removeUser(int id);
    
}
