package com.example.employeepayrollapplication.dto;

import java.time.LocalDate;

public class EmployeeDTO {

    private String employeeName;
    private String profilePic;
    private String gender;
    private long salary;
    private String department;
    private LocalDate startDate;

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

    public EmployeeDTO(String employeeName, String profilePic, String gender, long salary, String department, LocalDate startDate) {
        this.employeeName = employeeName;
        this.profilePic = profilePic;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
        this.startDate = startDate;
    }

    public EmployeeDTO() {
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeName='" + employeeName + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
