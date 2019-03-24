package homework_1.task_7;

public class testDeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Department dept = new Department(1, "HR");
        Employee original = new Employee(3, "Admin", dept);

        Employee cloned = (Employee) original.clone();

        cloned.getDepartment().setName("Finance");

        System.out.println(cloned.getDepartment().getName());
        System.out.println(original.getDepartment().getName());

    }
}
