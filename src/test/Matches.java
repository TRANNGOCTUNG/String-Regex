package test;

public class Matches {
    public static void main(String[] args) {
        boolean a = "Java is fun".matches("Java is fun");
        boolean b = "Java is coll".matches("Java.*");
        boolean c = "Java is power".matches("Java.*");
        System.out.println("a\n" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);
    }
}
