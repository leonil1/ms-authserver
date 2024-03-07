package com.codigo.mslogin.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {

    String generateToken(UserDetails userDetails);
    String extractUserName(String token);
    boolean validaToken(String token, UserDetails userDetails);

}
