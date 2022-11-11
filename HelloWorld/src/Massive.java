public class Massive {
    public static void main (String [] args){
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "кд";
        strings[2] = "чд";

        for (int d = 0; d < numbers.length; d++){
            System.out.println(numbers[d]);
        }
        for (String string: strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x:numbers1){
            sum = sum+x;
        }
        System.out.println(sum);

    }
}
