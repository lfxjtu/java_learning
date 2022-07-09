public class GardenShop {

    public static void main(String[] args) {
        int rosemary, thyme, lavender;

        for (rosemary = 0; rosemary < 9; rosemary++) {
            for (thyme = 0; thyme < 9; thyme++) {
                lavender = 8 - rosemary - thyme;
                if ((rosemary * 2.5 + thyme * 3.2 + lavender * 3.7) == 25.9) {
                    System.out.printf("Rosemary: %d thyme: %d  lavender: %d", rosemary, thyme, lavender);
                }
            }
        }
    }
}
