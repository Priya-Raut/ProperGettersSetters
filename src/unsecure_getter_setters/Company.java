package unsecure_getter_setters;

import java.util.List;

class Company {
    private List<Department> departments;
    private int[] employeeIds;

    List<Department> getDepartments() {
        return departments; /* Never return object references to collections directly */
    }

    void setDepartments(List<Department> departments) {
        this.departments = departments; /* Never set object references to collections directly */
    }

    int[] getEmployeeIds() {
        return employeeIds; /* Never return  object references directly */
    }

    void setEmployeeIds(int[] employeeIds) {
        this.employeeIds = employeeIds; /* Never set object references directly */
    }
}
