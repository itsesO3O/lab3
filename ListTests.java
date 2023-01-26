import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

import java.util.List;
import java.util.ArrayList;

public class ListTests implements StringChecker{
    public boolean checkString(String s){
        if(s.contains("r")){
            return true;
        }

        return false;
    }

    @Test
    public void filterTester(){
        List<String> testL = new ArrayList<>();
        StringChecker sc = new ListTests();
        testL.add("tea");
        testL.add("row");
        testL.add("water");
        testL.add("back");
        List<String> out = ListExamples.filter(testL, sc );
        assertArrayEquals(new String[]{"row", "water"}, out.toArray());
    }
}
