package lk.ijse.gdse.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {
    private String user_Id;
    private String name;
    private String email;
    private String password;
    private String role;
}
