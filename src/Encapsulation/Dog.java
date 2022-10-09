package Encapsulation;

public class Dog extends Animal{

    Dog(String name)
    {
        super(name , "hav hav");
        super.setInfotext("Kopek");
    }
    Dog (String name , String info)
    {
        super(name,"hav-hav",info);

    }

    @Override
    public String animalInfo() {
        return super.animalInfo() + "\n-----------------";
    }
}
