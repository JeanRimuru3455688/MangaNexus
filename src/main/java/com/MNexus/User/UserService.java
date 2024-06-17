package com.MNexus.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //CRUD 
    //metodo insert
    public Users save(Users entity) {
        return userRepository.save(entity);
    }

    //metodo select
    public Users findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<Users> findAll() {
        Iterable<Users> iterable = userRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
