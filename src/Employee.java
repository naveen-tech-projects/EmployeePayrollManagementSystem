public class Employee {
    int id;
    String name;
    double basicSalary;
    double allowance;
    double deduction;

    Employee(int id, String name, double basicSalary,
             double allowance, double deduction) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
    }
}