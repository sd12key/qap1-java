public class TestDate {
    public static void main(String[] args) {

        int day, month, year;

        // array of date data (for testing)
        Object [][] DATE_DATA = 
        {
            {12, 1, 1950},
            {28, 12, 2023},
            {1, 3, 2001},
            {6, 7, 1966},
            {10, 10, 2024}
        };
        
        // create new Date objects from the array
        System.out.println("\nCreating Date objects from the following data...");
        for (int i = 0; i < DATE_DATA.length; i++) {

            // get the day, month, and year from the array
            day = (int) DATE_DATA[i][0];
            month = (int) DATE_DATA[i][1];
            year = (int) DATE_DATA[i][2];
            
            // print the day, month, and year
            System.out.println("\n--> day: " + day + ", month: " + month + ", year: " + year);

            // create a new Date object
            Date date = new Date(day, month, year);

            // print it using toString() method
            System.out.println("*** Date object created: " + date.toString() + " ***");
        }

        System.out.println("\nDone!\n");
    }

}
