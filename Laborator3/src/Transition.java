public class Transition
{
    private String in;
    private String fn;
    private String value;


    public Transition(String value, String begin, String destination)
    {
        this.value = value;
        this.in = begin;
        this.fn = destination;
    }

    public String getValue() {
        return value;
    }


    public String getIn() {
        return in;
    }

    public String getFn() {
        return fn;
    }


    @Override
    public String toString() {
        return "Transition{" +
                "value='" + value + '\'' +
                ", in='" + in + '\'' +
                ", fn='" + fn + '\'' +
                '}';
    }
}