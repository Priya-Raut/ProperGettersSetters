package unsecure_getter_setters;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Never set object references directly */
        Company company = new Company();
        int[] ids = new int[]{1, 2, 3, 4, 5};
        company.setEmployeeIds(ids);
        System.out.println(Arrays.toString(company.getEmployeeIds()));
        /* It changes ids inside Company too. Why?
           ids and company.employeeIds point to same object in memory */
        ids[0] = 100;  /* This shouldn't change company.employeeIds */
        System.out.println(Arrays.toString(company.getEmployeeIds()));

        /* Never get object references directly */
        int[] ids1 = company.getEmployeeIds();
        System.out.println(Arrays.toString(company.getEmployeeIds()));
        ids1[0] = 500; /* This shouldn't change company.employeeIds */
        System.out.println(Arrays.toString(company.getEmployeeIds()));

        /* Never get/set immutable objects directly */
        Employee employee = new Employee();
        Date joiningDate = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        employee.setJoiningDate(joiningDate);
        System.out.println(employee.getJoiningDate());
        joiningDate.setTime(2000); /* This shouldn't change employee.joiningDate */
        System.out.println(employee.getJoiningDate());

        /* Never get/set collection of objects directly */
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
        departments.add(0, new Department()); /* This shouldn't change company.departments */
        departments.get(0).setDepartmentId(999); /* This shouldn't change a Department inside company.departments */
        System.out.println(company.getDepartments());

        Employee employee1 = new Employee();
        int id = 1;
        employee1.setEmployeeId(id);
        System.out.println(employee1.getEmployeeId());
        id = 2; /* This doesn't change employee.id */
        System.out.println(employee1.getEmployeeId());
    }
}
