public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr = new int[]{1,2,3};
        double arr1[] = {1.57, 7.654, 9.986};
        char arr2[] = {'A', 'R', 'T', 'E', 'M'};

        System.out.println();

        System.out.println("Задача 2");
        // Вопрос для проверяющего: Можно ли решить эту задачу примерно такимспособом, через объединение
        //3х массивов в 1 и последующий вывод всех элементов в 1 строку?
//        String strArr = Arrays.toString(arr); //Конвертация 1го массива с int в string
//        String strArr1 = Arrays.toString(arr1); //Конвертация 2го массива с double в string
//        String strArr2 = Arrays.toString(arr2); //Конвертация 3го массива с char в string
//        String strShared = strArr + strArr1 + strArr2;
//        for (String i : strShared){
//            System.out.print(i);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]);
            if (i != arr1.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]);
            if (i != arr2.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("Задача 3");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr1.length - 1; i >= 0; i--){
            System.out.print(arr1[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--){
            System.out.print(arr2[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
