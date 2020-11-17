
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        FA fa = new FA("file.txt");
        System.out.println();
        System.out.println("1. Get the set of states of the automaton:");
        System.out.println("2. Get the alphabet of the automaton:");
        System.out.println("3. Get the transitions of the automaton:");
        System.out.println("4. Get the initial state of the automaton:");
        System.out.println("5. Get the final state of the automaton:");
        System.out.println("0. Exit");
        int option = new Scanner(System.in).nextInt();

        while(true)
        {
            System.out.println();
            System.out.println("Choose an option: ");
            option = new Scanner(System.in).nextInt();

            if (option == 1)
            {
                System.out.println("Get the set of states: ");
                for(String s : fa.getStates())
                {System.out.println(s + " ");}
            }
            else if(option == 2)
            {
                System.out.println("Get the alphabet: ");
                for(String a : fa.getAlphabet())
                { System.out.println(a + " "); }
            }
            else if(option == 3)
            {
                System.out.println("Get the transitions ");
                for(Transition t : fa.getTransitions())
                { System.out.println(t.getIn() + "-" + t.getValue() + "-" + t.getFn()); }
            }
            else if(option == 4)
            {
                System.out.println("Get the initial state ");
                System.out.println(fa.getInitialState());
            }
            else if(option == 5)
            {
                System.out.println("Get the final state ");
                for(String fs : fa.getFinalState())
                { System.out.println(fs); }
            }
            else if(option == 0)
            {
                break;
            }
            else
            {
                System.out.println("...bad...");
            }

            System.out.println();

        }
    }

}