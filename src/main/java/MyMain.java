import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello im charles, whats your name?");
        String name = scan.next();
        System.out.println("Nice to meet you " + name + "!");
        System.out.println("What's your favorite color " + name + "?");
        String color = scan.next();
        System.out.println(color + " is a stupid color");
        System.out.println("Whats your favorite food?");
        String food = scan.next();
        System.out.println("wow, " + food+ ", how original");
        System.out.println("Ok, what do you as a hobby, " + name + "?");
        String hobby = scan.next();
        System.out.println("Wow, ive never met somebody who " + hobby + "s");
        System.out.println("I think this converstaion has gone well, what do you think, " + name + "?");
        String ok = scan.next();
        System.out.println(ok);
        scan.close();
    }
}
