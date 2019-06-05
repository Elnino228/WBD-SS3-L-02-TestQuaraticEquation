import java.util.Scanner;

public class TestQuaraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=sc.nextDouble();
        System.out.println("Enter b: ");
        double b=sc.nextDouble();
        System.out.println("Enter c: ");
        double c=sc.nextDouble();
        Account quaraticEquation=new Account(a,b,c);
         double delta=quaraticEquation.getDiscriminant();
         if (delta>0) {
             System.out.println("Equation has two root: "+quaraticEquation.getRoot1()+" and "+quaraticEquation.getRoot2());
         } else if (delta==0) {
             System.out.println("Equation has double root: "+quaraticEquation.getRoot1());
         } else {
             System.out.println("Equation has no real root.");
         }
    }
}
class Account {
    double a,b,c;
    public  Account(){
    }
    public Account(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private double getA() {
        return a;
    }
    private double getB() {
        return b;
    }
    private double getC() {
        return c;
    }
    public double getDiscriminant() {
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot1() {
        return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot2() {
        return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
    }
}