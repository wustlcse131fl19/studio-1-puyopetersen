package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("enter an integer");
        int n2 = ap.nextInt("enter a second integer");

System.out.println( (n1 + n2) /2.0);

    }
}
