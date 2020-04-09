package com.soloworld.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

  @Id
  private Long userId;
  private String userName;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
