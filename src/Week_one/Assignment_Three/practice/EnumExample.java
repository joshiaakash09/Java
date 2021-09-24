package Week_one.Assignment_Three.practice;

public class EnumExample {
    //Defining an enumeration to represent days of a week
    public enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        Day[] holiday = new Day[] { Day.SATURDAY, Day.SUNDAY};

        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend");
                break;
            default:
                System.out.println("It's a week day.");
        }
    }
}
