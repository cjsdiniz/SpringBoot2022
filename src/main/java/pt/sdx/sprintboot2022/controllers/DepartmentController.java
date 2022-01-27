package pt.sdx.sprintboot2022.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.sdx.sprintboot2022.entities.Department;
import pt.sdx.sprintboot2022.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;
    
    @GetMapping
    public List<Department> findAll(){
        List<Department> result = repository.findAll();
        return result;
    }
    
}
