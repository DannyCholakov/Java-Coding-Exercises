public class TeenNumberChecker {

//    Teen Number Checker

//    01.We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//    Write a method named hasTeen with 3 parameters of type int.
//    The method should return boolean and it needs to return
//    true if one of the parameters is in range 13(inclusive) - 19 (inclusive).

//    02.Write another method named isTeen with 1 parameter of type int.
//    The method should return boolean and it needs to return true if the parameter
//    is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static void main(String[] args) {
        System.out.println(hasTeen(10, 17, 10));
        System.out.println(isTeen(9));
    }

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {
        if (numberOne >= 13 && numberOne <= 19 || numberTwo >= 13 && numberTwo <= 19 || numberThree >= 13 && numberThree <= 19) {
            return true;
        } else
            return false;
    }

    public static boolean isTeen(int isTeenNumber) {
        if (isTeenNumber >= 13 && isTeenNumber <= 19)
            return true;
        else
            return false;
    }
}
