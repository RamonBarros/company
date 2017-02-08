package br.com.campany.service;

import br.com.campany.domain.Employee;

public interface EmployeeService {
    
    Iterable <Employee> listAllEmployee();
    
    Employee getEmployeeById(Long id);
    
    Employee saveEmployee(Employee employee);
    
    void deleteEmployee(Long id);
}
