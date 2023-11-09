public class linearSearch22 {
    public static void main(String[] args) {
        
        int[] arrayInt22 ={34, 18, 26, 48, 72, 20, 56, 63, 49};
        int key22 = 20;
        int result22 = 0;
        for (int i = 0; i < arrayInt22.length; i++) {
            if (arrayInt22[i] == key22) {
                result22 = i ;
                break;
            }
        }
        System.out.println("The key in the array is located at index position ==-==" + result22);
    }
}
