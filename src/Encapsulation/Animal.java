package Encapsulation;
// super clasımız
public class Animal {
    private String name , sound , info , infotext ;

// bunlar ctorlar önemli
    Animal(String name , String sound)
    {
        this.name=name;
        this.sound=sound;

    }

    Animal(String name , String sound , String info)
    {
        this.name=name;
        this.sound=sound;
        this.info=info;
        setInfotext(info);
    }

    // Canlının isminin alındıgı kısım
    public String getName()
    {
        return name;
    }

    // Canlının sesi
    public String getSound() {
        return sound;
    }

    // Canlının türünün dönüldüğü kısım
    public String getInfo() {
        return info;
    }

    // Canlının bilgilerinin oldugu kısım
    public String getInfoText()
    {
        return infotext;
    }

    // Canlı icin bir bilgi girilecekse burdan giriyoruz.
    public void setInfotext(String info)
    {
        this.infotext= "-> Benim İsmim: "+getName()+"\n-> Çıkardığım Ses: "+getSound()+"\n-> Türüm: "+info;
        System.out.println(infotext);
    }

    // consolda bu dönucek;
    public String animalInfo()
    {
        return "< Hayvan Bilgileri >\n-------------------\n"+getInfoText();
    }



    public static void main(String[] args) {

       Animal dog = new Dog("leo");
       dog.getInfoText();

       Dog d = new Dog("alex","kanis");

    }
}
