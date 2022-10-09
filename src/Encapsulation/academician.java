package Encapsulation;

public  class academician extends Calisan{
    private String bolum ;
    private String unvan ;

    public academician(String name , String surname , String number , String mail , String bolum , String unvan)
    {
        super(name,surname,number,mail);
        this.unvan=unvan;
        this.bolum=bolum;

    }

    public void derseGir()
    {
        System.out.println("derse giris yaptı");
    }


    public String getBolum()

    {
        return this.bolum;

    }

    public void setBolum(String bolumadi)

    {
        this.bolum=bolumadi;
    }

    public String getUnvan() {

        System.out.println(this.unvan + " olmussun dayı ");
        return "";
    }

    public void setUnvan(String unvar)
    {
        this.unvan = unvar;
    }

    public void dersGir()
    {
        System.out.println(this.getName() + "Derse giris yaptı");
    }
}
