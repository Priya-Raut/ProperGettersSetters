package secure_getter_setters;

import java.util.Date;

public class Employee {
    private int employeeId; /* Dont worry! primitive data type */
    private Date joiningDate; /* Caution! Object */
    private String name; /* Dont worry! Immutable object */

    int getEmployeeId() {
        return employeeId;
    }

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    Date getJoiningDate() {
        return (Date) joiningDate.clone();
    }

    void setJoiningDate(Date date) {
        this.joiningDate = (Date) date.clone();
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
