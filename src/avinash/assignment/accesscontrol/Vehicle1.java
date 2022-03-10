package avinash.assignment.accesscontrol;

interface Vehicle1 {
    void name();
    void cost();
}

interface Vehicle2 {
    void name();
    void cost();
}

interface Vehicle3 {
    void name();
    void cost();
}

interface Vehicle4 extends Vehicle1,Vehicle2,Vehicle3{
    void name();
}
class MainInterface implements Vehicle4{
    public static void main(String[] args){
        MainInterface mainInterface = new MainInterface();
        mainInterface.method1(mainInterface);
        mainInterface.method2(mainInterface);
        mainInterface.method3(mainInterface);
        mainInterface.method4(mainInterface);
    }

    @Override
    public void cost() {
        System.out.println("cost");
    }

    @Override
    public void name() {
        System.out.println("name");
    }

    public void method1(Vehicle1 vehicle1){
        vehicle1.cost();
        vehicle1.name();
    }
    public void method2(Vehicle2 vehicle2){
        vehicle2.cost();
        vehicle2.name();
    }
    public void method3(Vehicle3 vehicle3){
        vehicle3.cost();
        vehicle3.name();
    }
    public void method4(Vehicle4 vehicle4){
        vehicle4.cost();
        vehicle4.name();
    }
}