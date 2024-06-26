package org.tg.tgbot.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.tg.tgbot.model.User;
import org.tg.tgbot.repository.UserRepository;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
public class UserService {

    UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name).orElse(null);
    }

    public User getUserByNick(String nick) {
        return userRepository.findByNickName(nick).orElse(null);
    }
}
