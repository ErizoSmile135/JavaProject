package by.lesson.practics.class7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    public Service() {
    }

    public void authenticate (String login, String password) {
        List<User> users = UserRepository.getUserList();        // Тут мы впервые создали static users?
        List<String> loginList = new ArrayList<>();

        for (User user: users){
            loginList.add(user.getLogin());
        }

        if (!loginList.contains(login))
            throw new UserNotFoundException();
        else if (!users.get(loginList.indexOf(login)).checkPassword(password))       // индексы ведь должны совпадать, оба ArrayList и оба с одинаковой последовательностью логинов
            throw new NotCorrectPasswordException();

        System.out.println("Авторизация успешна");
    }
}
