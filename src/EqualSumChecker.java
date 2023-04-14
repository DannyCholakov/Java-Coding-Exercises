public class EqualSumChecker {

//    Equal Sum Checker

//    Write a method hasEqualSum with 3 parameters of type int.
//    The method should return boolean and it needs to return true if the sum of
//    the first and second parameter is equal to the third parameter.
//    Otherwise, return false.
//

    public static void main(String[] args) {
        System.out.println(hasEqualSum(2, 4, 6));
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {
        if (numberOne + numberTwo == numberThree) {
            return true;
        } else
            return false;
    }
}
