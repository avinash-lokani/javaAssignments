package avinash.assignment.accesscontrol;

public class Main {
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[2];

        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();

        rodents[0].Name();
        rodents[1].Name();
    }

}
class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("gerbil");
    }
    public void Name(){
        System.out.println("This is Rhodent of type Gerbil");
    }
}
class Mouse extends Rodent{
    public Mouse(){
        System.out.println("Mice");
    }
    public void Name(){
        System.out.println("This is Rhodent of type mouse");
    }
}
abstract class Rodent {
    public abstract void Name();
}
