package secure_getter_setters;

import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Department> departments; /* Caution! Collection */
    private int[] employeeIds; /* Caution! Array is an object in Java */

    List<Department> getDepartments() {
        /* clone each object and copy into new collection */
        List<Department> copyDepartments = new ArrayList<>();
        for(Department department : this.departments){
            copyDepartments.add((Department) department.clone());
        }
        /* return new collection */
        return copyDepartments;
    }

    void setDepartments(List<Department> inputDepartments) {
        this.departments = new ArrayList<>();
        /* Clone each object and store value into new collection */
        for(Department department : inputDepartments){
            this.departments.add((Department) department.clone());
        }
    }

    int[] getEmployeeIds() {
        int length = employeeIds.length;
        int[] copyEmployeeIds = new int[length];
        System.arraycopy(this.employeeIds, 0, copyEmployeeIds, 0, length);
        /* return new object */
        return copyEmployeeIds;
    }

    void setEmployeeIds(int[] ids) {
        int length = ids.length;
        this.employeeIds = new int[length];
        /* Store value into new object */
        System.arraycopy(ids, 0, this.employeeIds, 0, length);
    }
}
