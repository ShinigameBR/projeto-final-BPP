package br.com.expdev.springbootcleanarch.infrastructure.gateways;

import br.com.expdev.springbootcleanarch.application.gateways.UserGateway;
import br.com.expdev.springbootcleanarch.domain.entity.User;
import br.com.expdev.springbootcleanarch.infrastructure.persistence.UserEntity;
import br.com.expdev.springbootcleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
  private final UserRepository userRepository;
  private final UserEntityMapper userEntityMapper;

  public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    this.userRepository = userRepository;
    this.userEntityMapper = userEntityMapper;
  }

  @Override
  public User createUser(User userDomainObj) {
    UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
    UserEntity savedEntity = userRepository.save(userEntity);

    return userEntityMapper.toDomainObj(savedEntity);
  }

}