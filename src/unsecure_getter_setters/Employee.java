package unsecure_getter_setters;

import java.util.Date;

class Employee {
    private int employeeId;
    private Date joiningDate;
    private String name;

    int getEmployeeId() {
        return employeeId;
    }

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    Date getJoiningDate() {
        return joiningDate;
    }

    void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
