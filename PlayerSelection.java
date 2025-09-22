import java.util.Scanner;
class PlayerSelection{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Task 1 Declaring and using variables
        String name;
        int age;
        double height_meters;
        double weight_pounds;
        int jersey_number;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your height in meters: ");
        height_meters = input.nextDouble();
        System.out.print("Enter your weight in pounds: ");
        weight_pounds = input.nextDouble();
        System.out.print("Enter player's jersey number: ");
        jersey_number = input.nextInt();

        // convert weight to kgs and height to cm
        double pound = 0.45359237;
        int meter = 100;
        int height_cm = (int) (meter * height_meters);
        int weight_kg = (int) (pound * weight_pounds);

        //  categories
        String category;
        if (age < 20) {
            category = "Rising star";
        } else if (age >= 20 && age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
        // player positions
        String position;
        String Attacker = "No";
        switch (jersey_number) {
            case 1:
                position = "Goal Keeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                Attacker = "Yes";
                break;
            case 9:
                position = "Striker";
                Attacker = "Yes";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position not known";
        }

        // eligibility
        String eligibility;
        boolean isEligible = (age >= 18 && age<=35) && weight_kg <90;


        if (isEligible){
            eligibility = "Eligible";
        }
        else {
            eligibility = "Not eligible";
        }
        // lineups
        String line_up = "Bench";
        if (category == "Prime Player"){
            if (weight_kg < 80){
                line_up= "Lineup";}
            else {
                line_up="Bench";
            }
        }
// final decision
        String final_status = (isEligible)? "Play": "Rest";
        // final report
        System.out.println("Here is the player report: ");
        System.out.println("Player: " + name);
        System.out.printf("Age: %d (%s)\n", age, category);
        System.out.printf("Height: %d(cm)\n", height_cm);
        System.out.printf("Weight: %d(kg)\n", weight_kg);
        System.out.println("Jersey: " +  jersey_number);
        System.out.println("Position: " + position);
        System.out.println("Attacker Jersey: " + Attacker);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + line_up);
        System.out.println("Final Decision:  " + final_status);

        input.close();

    }
}
