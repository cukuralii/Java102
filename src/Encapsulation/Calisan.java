package Encapsulation;

public class Calisan {

    private String name ;
    private String surname ;
    private String telephone ;
    private String mail ;

    public Calisan(String name, String surname, String telephone, String mail) {
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.mail = mail;
    }

    // get metodları geri deger döndürür , set metodları döndürmez değisken degeri değisir

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void giris()
    {
        System.out.println(this.name + "" + this.surname + "" + "Giris yapildi"  );
    }

    public void cikis()
    {
        System.out.println(this.name + " " + "Cıkıs yapıldı");
    }

    public void yemekhane()
    {
        System.out.println("Yemekhaneye giris yapıldı");
    }


}
