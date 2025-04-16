package com.portestech.user.business;

import com.portestech.user.business.converter.UserConverter;
import com.portestech.user.business.dto.UserDTO;
import com.portestech.user.infrastructure.entity.User;
import com.portestech.user.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public UserDTO saveUser(UserDTO userDTO) {
        User user = userConverter.toUser(userDTO);
        return userConverter.toUserDTO(userRepository.save(user));
    }
}
