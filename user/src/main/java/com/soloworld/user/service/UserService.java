package com.soloworld.user.service;

import com.soloworld.user.dto.User;
import com.soloworld.user.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

  @Autowired
  private UserRepository userRepository;


  @Override
  public User getUser(Long userId) {
    return userRepository.findById(userId).map(usr -> new User(usr.getUserId(), usr.getUserName()))
        .orElse(null);
  }

  @Override
  public List<User> findAll() {
    return userRepository.findAll().stream().map(usr -> new User(usr.getUserId() ,usr.getUserName())).collect(
        Collectors.toList());
  }
}
