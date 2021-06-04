package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem7 {
    public static void main(String args[]){
        final double met = 0.09290304;
        Scanner a = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double b = a.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        double c = a.nextDouble();
        System.out.println("You entered dimensions of " + b + " by " + c + " feet.");
        double area = b * c;
        double meters = area*met;
        System.out.println("The area is: \n"+area+" square feet\n"+meters+" square meters");
    }
}
