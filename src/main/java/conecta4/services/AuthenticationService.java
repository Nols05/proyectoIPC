package main.java.conecta4.services;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private Map<String, String> users = new HashMap<>();

    public AuthenticationService() {
        users.put("PlayfulPaco", "passConecta4!");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}