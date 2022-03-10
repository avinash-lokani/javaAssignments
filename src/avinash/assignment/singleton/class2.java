package avinash.assignment.singleton;

public class class2 {
    String var_1;

    public  void setVar_1(String var) {
        this.var_1 = var;
    }

    public static class2 set(String var){
        class2 main = new class2();
        main.setVar_1(var);
        return main;
    }

    public void print(String s){
        System.out.println(s);
    }

}
