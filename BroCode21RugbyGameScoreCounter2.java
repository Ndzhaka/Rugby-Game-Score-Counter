import java.util.Scanner;

public class BroCode21RugbyGameScoreCounter2 {
    static int team1points = 0;
    static int team2points = 0;

    static String name;

    public static void main(String[] args) {

        start();
    }
    public static void start(){
        System.out.println("Greetings,What is your name?");
        Scanner scanner = new Scanner(System.in);
         name = scanner.nextLine();
        System.out.println("Welcome," + name +"!");
        System.out.println("Let's start!");
        addpoints();
    }
    public static void addpoints() {
        System.out.println("Here are your options\n1.)Add a try\n2.)Add a conversion\n3.)Quit");
        Scanner scanner = new Scanner(System.in);
        int Options = scanner.nextInt();
        if (Options == 3) {
            System.out.println("Goodbye, Thanks for Playing"+","+ name );
        } else {
            System.out.println("Which Team scored?\n1.)Team 1\n2.)Team 2");
            int team = scanner.nextInt();

            if (Options == 1 & team == 1) {
                int team1try = team1points += 5;
                System.out.println("Team 1, scored a try and has " + team1try + " " + "Points\n");
                lead();
                addpoints();


            } else if (Options == 2 & team == 2) {
                int team2try = team2points += 5;
                System.out.println("Team 2, scored a try and has " + team2try + " " + "Points\n");
                lead();
                addpoints();



            } else if (Options == 2 & team == 1) {
                int team1conversion = team1points += 3;
                System.out.println("Team 1, has " + team1conversion + " " + "Points\n");
                lead();
                addpoints();



            } else if (Options == 1 & team == 2) {
                int team2conversion = team2points += 3;
                System.out.println("Team 2 has" + team2conversion + " " + "Points\n");
                lead();
                addpoints();

            }}


        }
        public static void lead(){
        if(team1points>team2points){
            System.out.println("Team 1 is leading and team 2 is loosing\n");
        }else{
            System.out.println("Team 2 is leading and team 1 is loosing\n");
        }
        if(team1points==team2points){
            System.out.println("It's a tie!");
        }
        }

}

