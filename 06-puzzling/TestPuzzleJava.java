import java.util.ArrayList;
public class TestPuzzleJava 
{
    public static void main(String[] args)
    {
        PuzzleJava gen = new PuzzleJava();
        ArrayList<Integer>randomRolls = gen.getTenRolls();
        System.out.println(randomRolls);
        System.out.println(gen.getRandomLetter());
        System.out.println(gen.generatePassword());
        System.out.println(gen.getNewPasswordSet(0));
       
    }
    
}
