package com.soloworld.user.service;

import com.soloworld.user.dto.User;
import java.util.List;

public interface IUserService {

  User getUser(Long userId);

  List<User> findAll();

}
