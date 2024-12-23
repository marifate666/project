package com.example.zooapp;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private static List<User> users = new ArrayList<>();

    public static boolean registerUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // Пользователь уже существует
            }
        }
        users.add(new User(username, password));
        return true; // Регистрация успешна
    }

    public static boolean checkCredentials(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true; // Успешная авторизация
            }
        }
        return false; // Неверные логин или пароль
    }
}
