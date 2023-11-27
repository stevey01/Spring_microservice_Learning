package com.example.rest.serviceimpl;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.rest.dto.Userdto;
import com.example.rest.entity.User;
import com.example.rest.mapper.Usermapper;
import com.example.rest.repository.UserRepository;
import com.example.rest.service.UserService;

import java.util.List;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public Userdto createUser(Userdto userdto) {
    	User user =Usermapper.maptouser(userdto);
    	
    			
     Userdto s_user= Usermapper.maptouserdto(user);
 	
     
     return s_user;
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


}
