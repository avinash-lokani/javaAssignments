package avinash.assignment.accesscontrol;

public class Cycle implements cycle{
    public void balence(){
        System.out.println("balence from Cycle");
    }
}

class UniCycle extends Cycle implements cycle{
    public void balence(){
        System.out.println("balence from UniCycle");
    }
}

class BiCycle extends Cycle implements cycle{
    public void balence(){
        System.out.println("balence from BiCycle");
    }
}

class TriCycle extends Cycle implements cycle{

}
