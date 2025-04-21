public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployee;
    //defining constructor
    public Employee(int baseSalary){
        this(baseSalary,0);

    }

    public Employee(int baseSalary, int hourlyRate){  // constructor overloading
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }

    public static void numberStaticMembers(){
        System.out.println(numberOfEmployee);
    }

    public int calculateWage(int extraHours){
        return baseSalary+(extraHours+hourlyRate);
    }

    public int calculateWage(){  //method overloading
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("Salary cannot be 0 or less than");
        this.baseSalary=baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate<=0)
            throw new IllegalArgumentException("Hour cannot be less then 0 or less than that");
        this.hourlyRate=hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
