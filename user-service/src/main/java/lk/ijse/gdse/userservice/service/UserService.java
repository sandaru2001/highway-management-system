package lk.ijse.gdse.userservice.service;

import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.entity.UserEntity;

public interface UserService {
    void save(UserDTO userDTO);
    boolean isExistsUser(String userId);
    boolean checkCredentials(UserDTO userDTO);
}
