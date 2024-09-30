public class Vacancies {
    public static void main(String[] args) {
        
        int[] guestsIn;

        /* This tells java to create a new file */
        guestsIn = new int[]{1, 4, 0, 2, 2, 1, 4, 3, 0, 2};
        
        for(int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.println(guestsIn[roomNum]);
        }
    }
}