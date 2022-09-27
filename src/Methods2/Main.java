package Methods2;

public class Main {
    public static void main(String[] args) {
        String firstName = "Özge";
        String lastName= "Odabaş";
        String birthYear = "1999";
        String shortName = createShortName(firstName,lastName,birthYear);
        System.out.println(shortName);
    }

    public static void add() {
        System.out.println("Added");

    }
    public static void delete() {
        System.out.println("Deleted");

    }
    public static void update() {
        System.out.println("Updated");

    }

    public static String createShortName(String firstName, String lastName, String birthYear) {
        String shortName = firstName+lastName.substring(0,1)+birthYear.substring(2,4);
        return shortName;
    }
}
