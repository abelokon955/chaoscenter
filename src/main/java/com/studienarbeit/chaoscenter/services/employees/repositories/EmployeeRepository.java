package com.studienarbeit.chaoscenter.services.employees.repositories;

import com.studienarbeit.chaoscenter.services.shared.entities.Employees;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employees", collectionResourceRel =  "employees")
public interface EmployeeRepository extends PagingAndSortingRepository<Employees, Integer> {

}