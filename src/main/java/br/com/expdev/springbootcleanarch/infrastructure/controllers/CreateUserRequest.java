package br.com.expdev.springbootcleanarch.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {

}