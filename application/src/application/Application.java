package application;

public class Application {

    public static void main(String[] args) {
        Triplet<Boolean, Boolean, Boolean> x = new Triplet<>(true, false, true);
        System.out.println(x.getFirst());
        x.print();
    }
    
}
