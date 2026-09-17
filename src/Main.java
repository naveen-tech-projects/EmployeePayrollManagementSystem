import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println(" EMPLOYEE PAYROLL MANAGEMENT");
        System.out.println("================================");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();

        double grossSalary = basicSalary + allowance;
        double netSalary = grossSalary - deduction;

        System.out.println("\n========== PAYROLL REPORT ==========");

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Allowance: ₹" + allowance);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Deduction: ₹" + deduction);
        System.out.println("Net Salary: ₹" + netSalary);

        System.out.println("====================================");

        sc.close();
    }
}