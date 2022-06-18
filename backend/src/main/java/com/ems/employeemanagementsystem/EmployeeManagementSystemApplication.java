package com.ems.employeemanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ems.employeemanagementsystem.model.Employee;
import com.ems.employeemanagementsystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/* Employee employee = new Employee();
		employee.setFirstName("John");
		employee.setLastName("Smith");
		employee.setEmailId("john@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Juan");
		employee1.setLastName("Cruz");
		employee1.setEmailId("juan@gmail.com");
		employeeRepository.save(employee1); */
		
	}

}
