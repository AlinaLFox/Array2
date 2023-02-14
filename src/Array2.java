public class Array2 {
    public static void main(String[] args) {

        int sum1 = 0;
        int medium1 = 0;
        int pare1 = 0;

        int uniDimension[] = {1, 22, 333, 4444, 55555};
        for (int number = 0; number < uniDimension.length; number ++) {
            sum1 += uniDimension[number];
            medium1 = sum1 / uniDimension.length;

            if (uniDimension[number] % 2 == 0){
                System.out.println("Element par Array unidimensional: " + uniDimension[number]);
            }
            else {
                System.out.println("Element impar Array unidimensional: " + uniDimension[number]);
            }
        }

        int sum2 = 0;
        int medium2 = 0;

        int biDimension[][] = new int[2][4];
        biDimension[0][0] = 0;
        biDimension[0][1] = 1;
        biDimension[0][2] = 2;
        biDimension[0][3] = 3;

        biDimension[1][0] = 4;
        biDimension[1][1] = 5;
        biDimension[1][2] = 6;
        biDimension[1][3] = 7;

        for (int row = 0; row < biDimension.length; row++)
        for (int column = 0; column < biDimension[row].length; column++) {
            sum2 += biDimension[row][column];
            medium2 = sum2 / (biDimension.length * biDimension[0].length);

            if (biDimension[row][column] % 2 == 0) {
                System.out.println("Element par Array bidimensional: " + biDimension[row][column]);
            }
            else {
                System.out.println("Element impar Array bidimensional: " + biDimension[row][column]);
            }
        }
        System.out.println("Sum 1: " + sum1);
        System.out.println("Medium 1: " + medium1);

        System.out.println("Sum 2: " + sum2);
        System.out.println("Medium 2: " + medium2);





    }
}