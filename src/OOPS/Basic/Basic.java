// Write a program to swapping two value using a class

package OOPS.Basic;
public class Basic {
    public static void main(String[] args) {
        Swap s = new Swap();
        s.accept(3, 4);
        s.getValue();
        s.display();
    }
}
class Swap {
    int a, b;
    void accept (int m, int n) {
        a = m;
        b = n;
    }
    void display () {
        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);
    }
    void getValue() {
        int temp = a;
        a = b;
        b = temp;
    }
}


