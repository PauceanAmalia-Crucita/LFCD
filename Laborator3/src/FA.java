
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FA
{
    private List<String> states = new ArrayList<>();
    private List<String> alphabet = new ArrayList<>();
    private List<Transition> transitions = new ArrayList<>();
    private  String initialState;
    private List<String> finalState = new ArrayList<>();

    public FA() {}

    // read from file
    public FA(String filename) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename)))
        {
            String[] line;

            line = bufferedReader.readLine().split(" ");
            Collections.addAll(states, line);

            List<Integer> types = new ArrayList<>();
            line = bufferedReader.readLine().split(" ");
            for(String type : line)
            {
                types.add(Integer.parseInt(type));
            }

            for(int i=0; i< states.size(); i++)
            {
                if(types.get(i) == 1)
                { initialState = states.get(i); }

                if(types.get(i) == 2)
                { finalState.add(states.get(i)); }

            }

            int number_of_Transactions = Integer.parseInt(bufferedReader.readLine());
            for(int i=0; i < number_of_Transactions; i++) {
                line = bufferedReader.readLine().split(" ");
                transitions.add(new Transition(line[2], line[0], line[1]));
                alphabet.add(line[2]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public FA(List<String> set_of_States, List<String> alphabet, List<Transition> transitions, String initial_State, List<String> final_State)
    {
        this.states = set_of_States;
        this.alphabet = alphabet;
        this.transitions = transitions;
        this.initialState = initial_State;
        this.finalState = final_State;
    }

    public List<String> getStates()
    { return states; }

    public List<String> getAlphabet()
    { return alphabet; }

    public List<Transition> getTransitions()
    { return transitions; }

    public String getInitialState()
    { return initialState; }

    public List<String> getFinalState()
    { return finalState;}

}