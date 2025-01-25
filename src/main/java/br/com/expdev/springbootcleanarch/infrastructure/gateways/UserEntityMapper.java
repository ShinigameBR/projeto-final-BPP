package br.com.expdev.springbootcleanarch.infrastructure.gateways;

import br.com.expdev.springbootcleanarch.domain.entity.User;
import br.com.expdev.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
  public UserEntity toEntity(User userDomainObj) {
    return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
  }

  User toDomainObj(UserEntity userEntity) {
    return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
  }

}