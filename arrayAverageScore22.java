import java.util.Scanner;

public class arrayAverageScore22 {
    public static void main(String[] args) {
        Scanner xc22 = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter Student Score-"+i+" : ");
            score[i] = xc22.nextInt();
            
            } for (int i = 0; i < score.length; i++) {
            total+=score[i];
            }
            average=total/score.length;
            System.out.println("The Average Is= "+average);
            }

    }

