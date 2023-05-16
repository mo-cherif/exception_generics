package application;

public class Application {

    public static void main(String[] args) {
        Triplet<Boolean, String, Boolean> x = new Triplet<>(true, "mo", true);
        System.out.println(x.getFirst());
        x.print();
    }
    
}
