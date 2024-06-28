package com.envios.yelle.Service;

import com.envios.yelle.Model.User;

import java.util.List;

public interface IUserService {

    public List<User> users();
    public User findById(Long idUser);
    public User save(User user);
    public void deleteById(Long idUser);
}
