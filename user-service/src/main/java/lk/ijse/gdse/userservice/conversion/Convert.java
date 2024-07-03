package lk.ijse.gdse.userservice.conversion;

import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Convert {
    private final ModelMapper modelMapper;
    public UserEntity convertToEntity(UserDTO userDTO){
        return modelMapper.map(userDTO,UserEntity.class);
    }
}
