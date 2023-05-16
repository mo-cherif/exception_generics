package application;

public class Triplet <X, Y, Z> {
    private X x;
    private Y y;
    private Z z;
    
    // Contructeur triplet
    Triplet(X arg1, Y arg2, Z arg3) {
        this.x = arg1;
        this.y = arg2;
        this.z = arg3;
    }
    
    X getFirst() {
        return this.x;
    }
    
    Y getSecond() {
        return y; 
    }
    
    Z getThird() {
        return z;
    }
    
   
    void print() {
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(this.z);
    }
    
}
