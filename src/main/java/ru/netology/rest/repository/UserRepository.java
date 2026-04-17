package ru.netology.rest.repository;

import ru.netology.rest.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        // Добавляем тестовых пользователей
        users.add(new User("admin", "admin123",
                Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE)));
        users.add(new User("user", "user123",
                Arrays.asList(Authorities.READ)));
        users.add(new User("editor", "editor123",
                Arrays.asList(Authorities.READ, Authorities.WRITE)));
    }

    public List<Authorities> getUserAuthorities(String username, String password) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username) &&
                        user.getPassword().equals(password))
                .map(User::getAuthorities)
                .findFirst()
                .orElse(Collections.emptyList());
    }
}
