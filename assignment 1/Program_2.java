public class HR
{
    int id;
    String name;
    double salary;
    int commission;

    HR()
    {
        this.id = 0;
        this.name = "null";
        this.salary = 0.0;
        this.commission = 0;
    }

    HR(int i, String n, double sal, int com)
    {
        this.id = i;
        this.name = n;
        this.salary = sal;
        this.commission = com;
    }

    void setid(int id)
    {
        this.id = id;
    }

    void setname(String name)
    {
        this.name = name;
    }

    void setsalary(double salary)
    {
        this.salary = salary;
    }

    void setcommission(int commission)
    {
        this.commission = commission;
    }

    int getid()
    {
        return id;
    }

    String getname()
    {
        return name;
    }

    double getsalary()
    {
        return salary;
    }

    int getcommission()
    {
        return commission;
    }

    void display()
    {
        System.out.println("HR ID: " + id);
        System.out.println("HR Name: " + name);
        System.out.println("HR Salary: " + salary);
        System.out.println("HR Commission: " + commission);
    }

    public String toString()
    {
        return id + " " + name + " " + salary + " " + commission;
    }
}

class hrr
{
    public static void main(String[] args)
    {
        HR e1 = new HR();
        HR e2 = new HR(101, "Vaibhav", 5000.90, 5000);

        System.out.println("Default Constructor:");
        e1.display();

        System.out.println("\nParameterized Constructor:");
        e2.display();

        System.out.println("\nUsing Getters:");
        System.out.println(e2.getid());
        System.out.println(e2.getname());
        System.out.println(e2.getsalary());
        System.out.println(e2.getcommission());

        System.out.println("\nUsing Setters:");

        e2.setid(102);
        e2.setname("Rahul");
        e2.setsalary(6000.90);
        e2.setcommission(7000);

        e2.display();

        System.out.println("\nUsing toString():");
        System.out.println(e2);

        System.out.println("\nHashcode:");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
