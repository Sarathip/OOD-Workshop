import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("ทำการทดสอบ ..... ")
    public void case01(){
        Hello hello = new Hello();
        String name = "LotLotte";
        String result = hello.sawadee(name);
        assertEquals("Hello LotLotte" , result);
    }
}