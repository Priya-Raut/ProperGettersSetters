package secure_getter_setters;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Company company = new Company();
        int[] ids = new int[]{1, 2, 3, 4, 5};
        company.setEmployeeIds(ids);
        System.out.println(Arrays.toString(company.getEmployeeIds()));
        ids[0] = 100;  /* This doesn't change company's employeeIds */
        System.out.println(Arrays.toString(company.getEmployeeIds()));

        Employee employee = new Employee();
        Date joiningDate = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        employee.setJoiningDate(joiningDate);
        System.out.println(employee.getJoiningDate());
        joiningDate.setTime(2000); /* This doesn't change company's joiningDate */
        System.out.println(employee.getJoiningDate());

        List<Department> departments = new ArrayList<>();
        Department developmentDept = new Department();
        developmentDept.setName("Development");
        developmentDept.setDepartmentId(1);
        departments.add(developmentDept);

        Department businessDept = new Department();
        businessDept.setName("Business");
        businessDept.setDepartmentId(2);
        departments.add(businessDept);

        company.setDepartments(departments);

        System.out.println(company.getDepartments());
        departments.add(0, new Department()); /* This doesn't change company.departments */
        departments.get(0).setDepartmentId(999); /* This doesn't change a Department inside company.departments */
        System.out.println(company.getDepartments());

    }
}
