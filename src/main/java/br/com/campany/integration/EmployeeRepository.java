package br.com.campany.integration;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.campany.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
