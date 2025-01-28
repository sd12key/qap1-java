public class TestTime {
    public static void main(String[] args) {

        // create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 55);

        // display initial time
        System.out.println("\nInitial time:");
        System.out.println("--> Object t1: " + t1.toString());
        System.out.println("--> Object t2: " + t2.toString());

        // advance t1 by 1 second
        t1.nextSecond();

        // go back t2 by 1 second
        t2.previousSecond();

        // print updated time
        System.out.println("\nUpdated time:");
        System.out.println("--> t1 (after +second): " + t1.toString());
        System.out.println("--> t2 (after -second): " + t2.toString());

        System.out.println("\nDone!\n");
    }
}
