public class myClass {

    public  int plusNumber(int a, int b){
        int res = a + b;
         return res;
    }

    public  int plusNumber(int a, int b, int c){
        int res = a + b + c;
        return res;
    }

    // Написать метод который считает сумму элементов массива
    public static int summElem (int[] arr){
        int count = 0;
        int[] array = new int[arr.length];
        for (int i = 0; i<array.length; i++) {
            array[i] = arr[i];
            count += array[i];
        }
        System.out.println(count);
        return count;
    }

    // Метод получает на вход 2 массива и возвращает 1 общий
    static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
       /* if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("parameter is null");
        }*/
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            }
            if (i >= arr1.length && i < arr2.length + arr1.length) {
                arr3[i] = arr2[i - arr1.length];
                //System.out.println("text!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }

        return arr3;
    }

    public static int[] evenNumbersReturn(int[] a){
        int[] res = new int[a.length];
        for (int item : a){
            if (item % 2 == 0){
                res[item] = item;
            }
            System.out.println(res);
        }
        return res;
    }

}
