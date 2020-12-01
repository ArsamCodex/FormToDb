package be.javaaproach.dao;

import be.javaaproach.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface EmployeeDAO extends JpaRepository<Employee, Integer> {


    }


