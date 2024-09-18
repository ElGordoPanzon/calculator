public class main {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);


    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;

                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
