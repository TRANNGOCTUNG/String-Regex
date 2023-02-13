package test;

public class Messenger {
    public static void main(String[] args) {
        String messenger = "Well come to Java ";
        for (int i = 0; i < messenger.length(); i++) {

            System.out.println("The of length: " + messenger + messenger.charAt(i));
        }
        System.out.println("The of length: " + messenger + messenger.charAt(0));
        System.out.println("The of length: " + messenger + messenger.length());
    }
}
