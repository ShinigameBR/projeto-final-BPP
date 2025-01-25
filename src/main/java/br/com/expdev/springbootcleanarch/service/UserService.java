package br.com.expdev.springbootcleanarch.service;

import org.springframework.stereotype.Service;

import br.com.expdev.springbootcleanarch.model.User;
import br.com.expdev.springbootcleanarch.repository.UserRepository;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User create(User user) {
    return userRepository.save(user);
  }
}
