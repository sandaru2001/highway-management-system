package lk.ijse.gdse.userservice.controller;

import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/health")
    public String healthCheck(){
        return "User Working...!";
    }

    @PostMapping("/checkCredentials")
    public ResponseEntity<?> checkCredentials(@RequestBody UserDTO userDTO){
        if (userService.checkCredentials(userDTO)){
            return ResponseEntity.ok("Success");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failure");
        }
    }

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
        return ResponseEntity.ok("User saved successfully");
    }

}
