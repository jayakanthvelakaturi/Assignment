public class A {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void shuffleArray(int[] array) {
        int index, temp;
        for (int i = array.length - 1; i > 0; i--) {
            index = (int)(Math.random() * (i + 1));
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}