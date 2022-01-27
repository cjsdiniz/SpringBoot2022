package pt.sdx.sprintboot2022.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.sdx.sprintboot2022.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
