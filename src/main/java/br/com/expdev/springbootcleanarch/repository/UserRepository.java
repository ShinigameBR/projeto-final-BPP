package br.com.expdev.springbootcleanarch.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.expdev.springbootcleanarch.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
