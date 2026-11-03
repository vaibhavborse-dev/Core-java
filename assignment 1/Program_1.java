class Employee
{
    int id;
    String name;
    double salary;

    Employee()
    {
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0.0;
    }

    Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void setId(int id)
    {
        this.id = id;
    }

    void setName(String name)
    {
        this.name = name;
    }

    void setSalary(double salary)
    {
        this.salary = salary;
    }

    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    double getSalary()
    {
        return salary;
    }

    void display()
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name +
               ", salary=" + salary + "]";
    }
}

class Emp
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();

        Employee e2 = new Employee(101, "Vaibhav", 25000);

        System.out.println("Default Constructor:");
        e1.display();

        System.out.println("\nParameterized Constructor:");
        e2.display();

        System.out.println("\nUsing Getters:");
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

        System.out.println("\nUsing Setters:");
        e2.setSalary(30000);
        e2.display();

        System.out.println("\nUsing toString():");
        System.out.println(e2);

        System.out.println("\nHashcode:");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
