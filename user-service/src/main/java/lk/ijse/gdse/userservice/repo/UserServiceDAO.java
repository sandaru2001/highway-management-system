package lk.ijse.gdse.userservice.repo;

import lk.ijse.gdse.userservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServiceDAO extends JpaRepository<UserEntity, String> {
    public boolean existsByEmailAndPassword(String email, String password);
}
