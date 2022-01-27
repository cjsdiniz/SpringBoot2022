package pt.sdx.sprintboot2022.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.sdx.sprintboot2022.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
