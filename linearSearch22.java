import java.util.Scanner;

public class linearSearch22 {
    public static void main(String[] args) {
        //ModifyCode
        Scanner xc22 = new Scanner(System.in);

        System.out.print("How much the elemen :");
        
        int element22 = xc22.nextInt();
        int[] arrayInt22 = new int[element22];
            
        for (int i = 0; i < element22; i++) {
            System.out.print("Elemen at-"+(i+1)+" : ");
            arrayInt22[i]=xc22.nextInt();
        }
            
            System.out.print("What element are gonna you search : ");
            
            int key22 = xc22.nextInt();
            int result22 = -1;
            
        for (int i = 0; i < arrayInt22.length; i++) {
            if (arrayInt22[i] == key22) {
            result22 = i;
            break;
            }
        }
        
        //FUNGSION FOR NOT FOUND 
        if (result22 == -1) {
            System.out.println("Element not found is GONE WRONG");
        }else
        System.out.println("key are in array index at-"+result22);

        // System.out.println("key are in array index at-"+result22);

        //CODINGAN FIRST
        // int[] arrayInt22 ={34, 18, 26, 48, 72, 20, 56, 63, 49};
        // int key22 = 20;
        // int result22 = 0;
        // for (int i = 0; i < arrayInt22.length; i++) {
        //     if (arrayInt22[i] == key22) {
        //         result22 = i ;
        //         break;
        //     }
        // }
        // System.out.println("The key in the array is located at index position ==-==" + result22);
    }
}
