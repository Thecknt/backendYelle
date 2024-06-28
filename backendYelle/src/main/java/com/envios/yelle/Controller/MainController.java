package com.envios.yelle.Controller;

import com.envios.yelle.Exceptions.ApplicationException;
import com.envios.yelle.Model.User;
import com.envios.yelle.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"https://enviosyelle.netlify.app/", "*"})
@RestController
public class MainController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/registro")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
        try {
            if (user != null) {
                userRepository.save(user);
                return ResponseEntity.ok("Usuario creado exitosamente!");
            } else {
                throw new ApplicationException("El usuario no pudo ser creado", HttpStatus.BAD_REQUEST);
            }
        } catch (ApplicationException e) {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/todosLosUsuarios")
    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
       return users;
    }

    @GetMapping("/usuario/{idUser}")
    public ResponseEntity<?> findUserById(@PathVariable Long idUser){
        User user = userRepository.findById(idUser).orElse(null);
        if (user == null) {
            throw new ApplicationException("Usuario no encontrado en la base de datos.", HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok("El usuario "+ user.getName() + " "+ user.getLastname() + ", fue encontrado en la base de datos.");
        }
    }

    @PutMapping("/editarUsuario/{idUser}")
    public ResponseEntity<User> updateUser(@PathVariable Long idUser,
                                           @RequestBody User userReceived){

        User user = userRepository.findById(idUser).orElse(null);
        if (user == null){
            throw new ApplicationException("Usuario no encontrado con el id:"+idUser,HttpStatus.NOT_FOUND);
        } else {
            user.setName(userReceived.getName());
            user.setLastname(userReceived.getLastname());
            user.setEmail(userReceived.getEmail());
            user.setLocation(userReceived.getLocation());
            user.setProvince(userReceived.getProvince());

            userRepository.save(user);
            return ResponseEntity.ok(user);
        }
    }

    @DeleteMapping("/eliminarUsuario/{idUser}")
    public ResponseEntity<Map<String, Boolean>> deleteUser(Long idUser){
        User user = userRepository.findById(idUser).orElse(null);
        if (user == null){
            throw new ApplicationException("usuario no encontrado con el id:"+idUser,HttpStatus.NOT_FOUND);
        } else {
            userRepository.deleteById(idUser);
            Map<String, Boolean> response = new HashMap<>();
            response.put("Usuario eliminado exitosamente.", Boolean.TRUE);
            return ResponseEntity.ok(response);
        }
    }
}
