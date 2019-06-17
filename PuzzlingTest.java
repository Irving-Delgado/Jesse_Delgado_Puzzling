import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzlingTest{
    public static void main(String[] args){
        Puzzling result = new Puzzling();
        
        System.out.println(result.sumArray());
        System.out.println(result.nameArray());
        result.letterArray();
        System.out.println(result.randomArray());
        System.out.println(result.sortArray());
        result.randomLettersArray();
        result.randomTenArray();
    }
}