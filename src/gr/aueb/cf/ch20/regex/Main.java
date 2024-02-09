package gr.aueb.cf.ch20.regex;

public class Main {
    public static void main(String[] args) {
        String pass1 = "786Dgh";
        String pass2 = "Klo!9#31";

        System.out.println("Is the pass1 strong" + isPasswordStrong(pass1));

        System.out.println("Is the pass2 strong" + isPasswordStrong(pass2));
    }

    public static boolean isPasswordStrong(String str) {
        return str.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#?!@$%^&*-])^.{8,}");
    }
}
