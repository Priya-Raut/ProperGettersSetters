package unsecure_getter_setters;

public class Department {
    private String name;
    private int departmentId;

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
}
