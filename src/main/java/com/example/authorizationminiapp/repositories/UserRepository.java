package com.example.authorizationminiapp.repositories;

import com.example.authorizationminiapp.util.Authorities;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equalsIgnoreCase("root") && password.equals("123456")) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else
            return List.of();
    }
}
