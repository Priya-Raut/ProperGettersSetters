package secure_getter_setters;

public class Department {
    private String name;  /* Dont worry! Immutable object */
    private int departmentId; /* Dont worry! primitive data type */

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getDepartmentId() {
        return departmentId;
    }

    void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }

    /**
     *
     * @return
     */
    @Override
    protected Object clone() {
        Department clonedDepartment = new Department();
        clonedDepartment.departmentId = this.departmentId;
        clonedDepartment.name = this.name;
        return clonedDepartment;
    }
}
