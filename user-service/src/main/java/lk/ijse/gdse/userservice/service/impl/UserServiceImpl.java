package lk.ijse.gdse.userservice.service.impl;

import lk.ijse.gdse.userservice.conversion.Convert;
import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.repo.UserServiceDAO;
import lk.ijse.gdse.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserServiceDAO userServiceDAO;

    @Autowired
    private Convert convert;
    @Override
    public void save(UserDTO userDTO) {
        userServiceDAO.save(convert.convertToEntity(userDTO));
    }

    @Override
    public boolean isExistsUser(String userId) {
        return userServiceDAO.existsById(userId);
    }

    @Override
    public boolean checkCredentials(UserDTO userDTO) {
        return userServiceDAO.existsByEmailAndPassword(userDTO.getEmail(),userDTO.getPassword());
    }
}
