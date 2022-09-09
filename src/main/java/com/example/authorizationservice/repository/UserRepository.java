package com.example.authorizationservice.repository;

import com.example.authorizationservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {

    public UserRepository() {
    }

    private HashMap<User, List<Authorities>> users = new HashMap<>() {{
        put(new User("admin", "123"), new ArrayList<>(Arrays.asList(Authorities.values())));
    }};

    public List<Authorities> getUserAuthorities(String user, String password) {
        return users.get(new User(user, password));
    }

}
