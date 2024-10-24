package inheritance;

public class Animal {
    protected String  name;
    protected String type;

    Animal(){

    }

    Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void makeSound(){
        System.out.println("Generic sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
