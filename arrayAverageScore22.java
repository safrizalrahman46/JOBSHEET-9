import java.util.Scanner;

public class arrayAverageScore22 {
    public static void main(String[] args) {
        Scanner xc22 = new Scanner(System.in);

        int[] score = new int[5];
        int counterL=0,counterP=0, student;
        double averageL,averageP, totalP=0,totalL=0;
        double total = 0;
        // double average;

        System.out.print("Total Students : ");
        student = xc22.nextInt();

        int[] totalScore = new int[10];

        // for (int i = 0; i < score.length; i++) {
        //     System.out.print("Enter Student Score-"+i+" : ");
        //     score[i] = xc22.nextInt();

        //     } for (int i = 0; i < score.length; i++) {
        //     total+=score[i];
        //     }

            //Modify1
            // for (int i=0; i < score.length; i++) {
            //     if (score[i]>70) {
            //     counterL++;
            //     }else{
            //     counterP++;
            //     }
            // }

            //modify2
            
            for (int i=0; i < student; i++) {
                System.out.print("Input Score student are-"+(i+1)+" : ");
                score[i] = xc22.nextInt();

                }for (int i=0; i < student; i++) {
                    if (score[i]>70) {
                    totalL+=score[i];
                    counterL++;
                }else{
                    totalP+=score[i];
                    counterP++;
                }
            }

            //Add Those
            averageL=totalL/counterL;
            averageP=totalP/counterP;

            System.out.println("Student Passed "+averageL);
            System.out.println("Student Failed "+averageP);

            // average=total/score.length;
            // System.out.println("The Average Is= "+average);
            }

    }

