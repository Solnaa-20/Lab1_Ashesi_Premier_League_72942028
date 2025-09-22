import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        System.out.println("Team Selection Simulator");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        int height;
        double weight;
        int jerseyNumber;
        double pound = 0.45359237;
        int meters = 100;
        String category;
        String position;
        String attackerJersey;
        String eligibility;
        String lineup;
        String finalDecision;

        System.out.print("Enter player name: ");
        name = scanner.nextLine();

        System.out.print("Enter player age: ");
        age = scanner.nextInt();

        if(age<20) {
            category = "Rising Star";
        }
        else if(age<=30){
            category = "Prime Player";
        }
        else{
            category = "Veteran";
        }


        System.out.print("Enter player height(in meters): ");
        height = scanner.nextInt();
        height = height * meters;  //Task 2

        System.out.print("Enter player weight(in pounds): ");
        weight = scanner.nextDouble();
        weight = (int) (weight * pound); //Task 2

        System.out.print("Enter player jersey number: ");
        jerseyNumber = scanner.nextInt();

        switch(jerseyNumber){
            case 1 -> position = "Goalkeeper";
            case 2,4,5,12 -> position = "Defender";
            case 8,6 -> position = "Midfielder";
            case 11,7 -> position = "Winger";
            case 10 -> position = "Playmaker";
            case 9 -> position = "Striker";
            default -> position = "Player position not known";
        }
        if(jerseyNumber == 11 || jerseyNumber == 7 || jerseyNumber == 9){
            attackerJersey = "Yes";
        }
        else attackerJersey = "No";

        if(age>=18 && age<=35 && weight<90) {
            eligibility = "Eligible";
        }
        else{
            eligibility = "Not Eligible";
        }

        if(category.equals("Prime Player")){
            if(weight <80) {
                lineup = "Starting lineup";
            }
            else lineup = "Bench";
        }
        else lineup = "Bench";

        finalDecision = (eligibility.equals("Eligible"))? "Play":"Rest";



        System.out.println();
        System.out.println("Player Report");
        System.out.println("*******************");
        System.out.println("Player Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height + "cm");
        System.out.println("Weight: "+ weight +"kg");
        System.out.println("Jersey: "+ jerseyNumber);
        System.out.println("Position: "+ position);
        System.out.println("Attacker jersey: "+ attackerJersey);
        System.out.println("Eligibility: "+ eligibility);
        System.out.println("Lineup Decision: "+ lineup);
        System.out.println("Final Decision: "+ finalDecision);


        scanner.close();

    }
}
