import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        double not=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Note");
        try {
            not = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {

            System.out.println("Number Entry Error");
        } catch (IOException e) {

            System.out.println("ERROR READING KEYBOARD");
        }

        if(not<0)
        {
            System.out.println("WRONG NOTE");
        }
        else if(not<50)
        {
            System.out.println("Failed(1)");
        }
        else if (not < 60)
        {
            System.out.println("Low Passes(2)");
        }
        else if (not < 70)
        {
            System.out.println("Mid Passes(3)");
        }
        else if (not < 85)
        {
            System.out.println("Well Passes(4)");
        }
        else if (not <= 100)
        {
            System.out.println("Very Well Passes(5)");
        }
    }
}