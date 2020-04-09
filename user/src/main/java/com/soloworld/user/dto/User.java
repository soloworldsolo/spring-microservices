package com.soloworld.user.dto;

public class User {

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

  public User(Long userId, String userName) {
    this.userId = userId;
    this.userName = userName;
  }

  public User() {
  }
}
