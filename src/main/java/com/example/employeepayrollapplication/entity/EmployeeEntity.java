package com.example.employeepayrollapplication.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class EmployeeEntity {

    @Id
    private long employeeId;
    private String employeeName;
    private String profilePic;
    private String gender;
    private long salary;
    private String department;
    private LocalDate startDate;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public EmployeeEntity(long employeeId, String employeeName, String profilePic, String gender, long salary, String department, LocalDate startDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.profilePic = profilePic;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
        this.startDate = startDate;
    }

    public EmployeeEntity() {
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
