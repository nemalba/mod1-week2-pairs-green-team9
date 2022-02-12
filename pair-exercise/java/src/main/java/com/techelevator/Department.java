package com.techelevator;

public class Department {
    private int departmentId;
    private String name;

    //constructor
    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }


    //getters and setters


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
