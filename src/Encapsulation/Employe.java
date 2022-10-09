package Encapsulation;

import java.sql.SQLOutput;

public class Employe {

    private String ayrac = "-------------";
    private String name, surname , job ;
    private int salary, annualPermit ;

    Employe(String name , String surname)
    {
        this.name=name;
        this.surname=surname;
        this.job="Calısan";
        this.salary = 2500;
        this.annualPermit=14;
    }

    // davranıs icerisine neler yapabilecegini kosul da belirtmemiz tabi ki mumkun
    Employe()
    {

    }


    Employe(String name , String surname , int salary)
    {
        this.name = name ;
        this.surname = surname;
        this.salary=salary;
        this.annualPermit=14;

        if (salary>3000)
        {
            this.job="Kıdemli calısan";
            annualPermit += 3 ; // kıdemli calısanlara 3 gün fazladan tatil veriyoruz .
        } else if (salary<3000 && salary>0) {
            this.job="Calısan";
        }
        else
        {
            this.job="stajyer";
        }
    }


    public int makeRaise(int howMuch)
    {
        salary += howMuch;
        return salary;
    }
    public int makeRaise(double howMuch)
    {
        double money = (double)salary*howMuch;
        makeRaise((int)money);
        return ((int)money);
    }


    // Verileri degistirmek istyeyebiliririz onu bu metodlardan yapıcaz
    public void setJob(String job)
    {
        this.job=job;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public void setAnnualPermit(int annualPermit)
    {
        this.annualPermit=annualPermit;
    }

    // Verileri cagırmak için

    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname()
    {
        return surname;
    }

    public String getJob() {
        return job;
    }
    public int getSalary() {
        return salary;
    }
    public int getAnnualPermit() {
        return annualPermit;
    }

    // calısanın bilgilerini yazdırma box

    public void infoBox()
    {
        System.out.println(
                "<CALISAN İSMİ -> " + getName() + " \n CALISAN SOYİSMİ -> " + getSurname() + ayrac +
                " \n Calısan görevi -> " + getJob() + ayrac +
                " \n Calısan maası -> "  + getSalary() + "$" + ayrac +
                " \n Calısan izini -> "  + getAnnualPermit());
    }
    public void raiseinfo()
    {
        System.out.println(getJob() + " Zam uygulaması verilen yüzde zam :" + makeRaise(0.70) + "Yeni maas" + getSalary());
    }


    public static void main(String[] args) {
        Employe e = new Employe("ali","deli",50000);
        Muhendis m = new Muhendis("Ali","Cukur");
        Muhendis d = new Muhendis("deli ", "veli" ,15000);
        e.infoBox();
        e.raiseinfo();
        Employe w = new Muhendis("ali","veli",5000);
        w.infoBox();
        w.raiseinfo();

    }
}
