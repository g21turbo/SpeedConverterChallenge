public class Main {
    public static void main(String[] args) {

        toMilesPerHour(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            return (long) Math.round(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            System.out.println(kilometersPerHour + " km/h = " + Math.round(milesPerHour) + " mi/h");
        }
    }



}