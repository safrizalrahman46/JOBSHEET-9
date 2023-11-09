import java.util.Scanner;

public class StudentRecap22 {
    public static void main(String[] args) {
        
    Scanner XC22 = new Scanner(System.in);
        
        int[] score22 = new int[100000];
        int quantity22, container22 = 0,total=0;
        
        double average22;
        System.out.print("How much the quantity : ");
        quantity22 = XC22.nextInt();

        for (int i = 0; i < quantity22; i++) {
        System.out.print("input score22 for quantity  "+(i+1)+" : ");
        score22[i]=XC22.nextInt();
        total+=score22[i];
        }for (int i = 0; i < quantity22; i++) {
        for (int j = 1; j < quantity22; j++) {
        if (score22[j-1]>score22[j]) {
        container22=score22[j];
        score22[j]=score22[j-1];
        score22[j-1]=container22;
        }
    }

        }average22 =(double) total/quantity22;
        System.out.println("Average score22 from quantity = "+average22);
        System.out.println("Highest score = "+score22[quantity22-1]);
        System.out.println("Lowest Score = "+score22[0]);

    }
}
