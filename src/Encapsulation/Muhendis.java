package Encapsulation;

public class Muhendis extends Employe{

    Muhendis()
    {
        super();
        setSalary(5000);
    }

    Muhendis(String name, String surname )
    {
        super("Ali", "Cukur" );
        this.setSalary(5000);
        this.setJob("Engineer");
        this.setAnnualPermit(15);
    }

 Muhendis(String name , String surname , int salary)
   {
       super(name,surname);
       setSalary(salary);

       if (salary>10000)
       {
           setJob("Senior Engineer");
           setAnnualPermit(35);
       }
       else if ( salary>7000)
       {
           setJob("Mid Engineer");
           setAnnualPermit(25);
       }
       else
       {
           setName("Junior Engineer");
           setAnnualPermit(0);
       }
   }
    public int makeRaise(double howMuch) {
        double money = (double) (getSalary()*(howMuch)+250);
        makeRaise((int) (money));
        return (int)money;
    }
}
