public class Array {



    public static int getMax(int[] ArrayValue) {
        int maxValue = ArrayValue[0];
        for (int i = 1; i < ArrayValue.length; i++) {
            if(ArrayValue[i] > maxValue) {
                maxValue = ArrayValue[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] ArrayValue) {
        int minValue = ArrayValue[0];
        for (int i = 1; i < ArrayValue.length; i++) {
            if(ArrayValue[i] < minValue) {
                minValue = ArrayValue[i];
            }
        }
        return minValue;
    }


    public static void main(String[] args) {


        int[] array = {2, 67, 967, 687, 9, 70, 43, 45};


      //  System.out.println("Minimum = " + array[0]);
      //  System.out.println("Maximum = " + array[array.length-1]);

        int max = getMax(array);
        System.out.println("The max Value is: " + max);


        int min = getMin(array);
        System.out.println("The min Value is: " + min);
    }



}