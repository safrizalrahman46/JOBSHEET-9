import java.util.Scanner;

public class arrayValue22 {
    public static void main(String[] args) {
        Scanner xn22 = new Scanner(System.in);

        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score" + i + " : ");
            finalScore[i] = xn22.nextInt();

            //MODIFIKASI   
                }for (int i = 0; i < finalScore.length; i++) {
                    if (finalScore[i] > 70) {
                        System.out.println("Student " + i + "PASSED AWAY!");
                    }else {
                        System.out.println("Student are= " + i + "FAILED AWAY!");
                    }
                
        }
        //         }for (int i = 0; i < 10; i++) {
        //         System.out.println("Final Score "+ i +" is A "+finalScore[i]);
        // }
    }
}
