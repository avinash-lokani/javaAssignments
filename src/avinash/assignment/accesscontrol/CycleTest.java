package avinash.assignment.accesscontrol;

public class CycleTest {
    public static void main(String[] args){
        Cycle bicycle = new BiCycle();
        Cycle unicycle = new UniCycle();
        Cycle tricycle = new TriCycle();

        bicycle.balence();
        unicycle.balence();
        tricycle.balence();

        BiCycle bicycle1 = new BiCycle();
        UniCycle unicycle1 = new UniCycle();
        TriCycle tricycle1 = new TriCycle();

        bicycle1.balence();
        unicycle1.balence();
        tricycle1.balence();
    }
}
