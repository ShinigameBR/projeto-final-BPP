package br.com.expdev.springbootcleanarch.application.gateways;

import br.com.expdev.springbootcleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
