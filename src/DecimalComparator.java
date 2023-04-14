public class DecimalComparator {

//    DecimalComparator

//    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//    The method should return boolean and it needs to return true if two double numbers
//    are the same up to three decimal places. Otherwise, return false.

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.1754));
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        int myFirstCheck = (int) (numberOne * 1000);
        int mySecondCheck = (int) (numberTwo * 1000);
        if (myFirstCheck - mySecondCheck == 0) {
            return true;
        } else
            return false;
    }

//    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
//        int aInt = (int)(a * 1000);
//        int bInt = (int)(b * 1000);
//        return aInt == bInt;
//    }
}
