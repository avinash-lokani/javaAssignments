package avinash.assignment.accesscontrol;

class FactoryInvoke {
    public static void main(String[] args){
        UniCycleFactory uniCycleFactory = new UniCycleFactory();
        cycle unicycle = uniCycleFactory.getCycle("UniCycle");
        unicycle.balence();

        BiCycleFactory biCycleFactory = new BiCycleFactory();
        cycle bicycle = biCycleFactory.getCycle("BiCycle");
        bicycle.balence();

        TriCycleFactory triCycleFactory = new TriCycleFactory();
        cycle tricycle = triCycleFactory.getCycle("TriCycle");
        tricycle.balence();
    }
}
