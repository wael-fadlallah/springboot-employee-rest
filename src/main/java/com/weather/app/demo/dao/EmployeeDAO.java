package com.weather.app.demo.dao;
import com.weather.app.demo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
