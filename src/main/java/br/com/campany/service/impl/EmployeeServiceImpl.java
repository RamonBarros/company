package br.com.campany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.campany.domain.Employee;
import br.com.campany.integration.EmployeeRepository;
import br.com.campany.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public Iterable<Employee> listAllEmployee() {
        
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        
        return employeeRepository.findOne(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        
        employeeRepository.delete(id);
    }

}
