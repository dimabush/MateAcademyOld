package homework01;

class DrawingARhombus {

    static void drawRhomb(int sizeOfTheRhomb) {
        if (sizeOfTheRhomb % 2 == 0)
            System.out.println("Please enter an odd number");
        else {
            int leftRange = sizeOfTheRhomb / 2;
            int rightRange = sizeOfTheRhomb / 2;

            for (int i = 0; i < sizeOfTheRhomb; i++) {
                for (int j = 0; j < sizeOfTheRhomb; j++) {
                    if (i + j >= leftRange && i + j <= rightRange) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                if (i < sizeOfTheRhomb / 2)
                    rightRange += 2;
                else
                    leftRange += 2;
                System.out.println();
            }
        }
    }
}
