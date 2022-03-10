package avinash.assignment.accesscontrol;

public interface cycle {
    void balence();
}

class UniCycleFactory{
    public cycle getCycle(String type){
        if(type == null)
            return null;
        else if(type.equalsIgnoreCase("UniCycle")){
                return new UniCycle();
        }
        else
            return null;

    }
}

class BiCycleFactory{
    public cycle getCycle(String type){
        if(type == null)
            return null;
        else if(type.equalsIgnoreCase("BiCycle")){
            return new BiCycle();
        }
        else
            return null;

    }
}
class TriCycleFactory{
    public cycle getCycle(String type){
        if(type == null)
            return null;
        else if(type.equalsIgnoreCase("TriCycle")){
            return new TriCycle();
        }
        else
            return null;

    }
}

