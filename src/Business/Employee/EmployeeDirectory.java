/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String fname,String lname){
        Employee employee = new Employee();
        employee.setFname(fname);
        employee.setLname(lname);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee createDoctor(String fname,String lname)
    
    {
    Doctor doctor= new Doctor();
    doctor.setFname(fname);
    doctor.setLname(lname);
    employeeList.add(doctor);
    return doctor;
        
    }
    
    public Employee createPatient(Patient patient)
    {
        //Patient patient= new Patient();
        employeeList.add(patient);
        return patient;
    
    }
}
