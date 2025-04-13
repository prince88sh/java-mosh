public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------");
        TextBox textBox1=new TextBox();
        //var TextBox=new TextBox();  both are same
        textBox1.setText("HELLO BOSS");
        System.out.println(textBox1.text);  //if you do not enter anything then it is nulll

        var textBox2=new TextBox();
        System.out.println(textBox2.text);

        var textBox3=textBox1;
        textBox3.setText("hello sir");
        System.out.println(textBox1.text);

        System.out.println("\n--------------------------------------\n");
        int baseSalary=50_000;
        int extraHours=10;
        int hourlyRate=20;

        System.out.println(calculateWage(baseSalary,extraHours,hourlyRate));
        System.out.println("\n--------------------------------------\n");

        //now using OOP programming
        //1. Encapsulation : basically adding fields and methods using class and hiding it with the help of access
        // modifier and compulsory adding getter and setter
//        var employee=new Employee();
//        employee.setBaseSalary(49_56_789); //setter
//        employee.setHourlyRate(9);
//        System.out.println(employee.calculateWage(16));

        //2. Abstraction: reduce complexity by hiding unnecessary details

        /*
        * Coupling concept: The level of dependency between classes
        * Reducing compling : not making all unnecessary methods into public (By hiding unnecessary details)*/
        System.out.println("\n--------------------------------------\n");
        var browser = new Browser();
        browser.naviagte("zLKV kjsz jxc jszkjb");

        System.out.println("\n--------------------------------------\n");
        //USE OF CONSTRUCTOR
        var emp1=new Employee(50_000,20);
        System.out.println(emp1.calculateWage(3456));

        Employee emp2=new Employee(89_000);
        System.out.println(emp2.calculateWage());



        //static it does not belong to any instance of call
        //to use when present concept that should be in the single place...
        //Value is independent of object
        System.out.println(Employee.numberOfEmployee);  //use of static field
        System.out.println(Employee.numberOfEmployee);
        Employee.numberStaticMembers();                 // use of static member
    }
    // below used for procedural programming using function
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary+(extraHours*hourlyRate);
    }

}