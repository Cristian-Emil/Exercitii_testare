package Java_E3;

class A{
    int a = 10;
    int b = 20;
    void M() {
        System.out.println(a);
        System.out.println(b);
    }
}

class B extends A {
    int c = 30;

    void N() {
        System.out.println(c);
    }
}

class C extends B {
    int d = 15;
    int e = 25;

    void P() {
        System.out.println(d);
        System.out.println(e);
    }
}

public class Clase {

    public static void main(String[] args) {
        B b_obiect= new B();

        b_obiect.a = 120;
        b_obiect.b = 130;
        b_obiect.c = 140;

        b_obiect.M();
        b_obiect.N();
            System.out.println("");

        C c_obiect = new C();
        c_obiect.a = 125;
        c_obiect.b = 135;
        c_obiect.c = 145;
        c_obiect.d = 155;
        c_obiect.e = 165;


        System.out.println(b_obiect.a);
            System.out.println("");
        System.out.println(b_obiect.b);
            System.out.println("");
        System.out.println(b_obiect.c);
            System.out.println("");
        System.out.println(c_obiect.d);
            System.out.println("");
        System.out.println(c_obiect.e);
            System.out.println("");
        b_obiect.M();
            System.out.println("");
        b_obiect.N();
            System.out.println("");
        c_obiect.M();
            System.out.println("");
        c_obiect.N();
            System.out.println("");
        c_obiect.P();
    }
}
