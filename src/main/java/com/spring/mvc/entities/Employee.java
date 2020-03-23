package com.spring.mvc.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employees")
public class Employee {

    @Id   // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotBlank(message = "required")
    @Column(name = "firstName")
    private String firstName;
    @NotNull
    @NotBlank(message = "required")
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "salary")
    @Min(value = 2900, message = "le salaire doit >= le smic(2900)")
    private int salary;

    public Employee() { }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
