public class BarkingDog {

//    Barking Dog

    //    We have a dog that likes to bark.We need to wake up if the dog is barking at night!
//    Write a method shouldWakeUp that has 2 parameters.
//    1st parameter should be of type boolean and be named barking it represents
//    if our dog is currently barking.
//    2nd parameter represents the hour of the day and is of type int
//    with the name hourOfDay and has a valid range of 0-23.
//    We have to wake up if the dog is barking before 8 or after 22 hours
//    so in that case return true.
//    In all other cases return false.
//    If the hourOfDay parameter is less than 0 or greater than 23 return false.
    public static void main(String[] args) {
        shouldWakeUp(false, -2);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            barking = false;
        } else
            barking = true;
        System.out.println(barking);
        return barking;
    }

//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        if (hourOfDay < 8 && barking == true && hourOfDay >= 0 || hourOfDay > 22 && barking == true && hourOfDay <= 23) {
//            barking = true;
//        } else
//            barking = false;
//        System.out.println(barking);
//        return barking;
//    }

}
