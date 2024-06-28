package com.envios.yelle.Service;

import com.envios.yelle.Model.User;
import com.envios.yelle.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class UserService implements  IUserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> users() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(Long idUser) {
        return this.userRepository.findById(idUser).orElse(null);
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteById(Long idUser) {
        this.userRepository.deleteById(idUser);
    }
}
