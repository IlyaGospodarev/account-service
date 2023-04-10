package account.service;

import account.model.dto.UserDto;
import account.model.entity.User;
import account.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto registerUser(User user) {
        return new UserDto(user.getName(),
                                      user.getLastname(),
                                      user.getEmail());
    }
}
