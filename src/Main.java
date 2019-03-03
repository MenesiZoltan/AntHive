import com.codecool.anthive.Hive;



public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Ant world!");

        Hive hive = new Hive();


        for (int e = 0; e < 200; e++) {
            hive.startStepCycle();
        }


        /*This is the entry point*/
        /*Hive will be created here.*/
    }
}
