import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyRangeTest {

    @Test
    @DisplayName("ข้อมูล [1-5] isStartWithInclude True")
    public  void startWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertEquals(true , result);
    }

    @Test
    @DisplayName("ข้อมูล (1-5] isStartWithInclude False")
    public  void startWithInclude1(){
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertEquals(false , result);
    }

    @Test
    @DisplayName("ข้อมูล [1-5] isEndWithInclude True")
    public  void endWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertEquals(true , result);
    }

    @Test
    @DisplayName("ข้อมูล (1-5) isEndWithInclude False")
    public  void endWithInclude1(){
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertEquals(false , result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] getStartNumber 1")
    public  void startNumber(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStartNumber();
        assertEquals(1 , result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) getStartNumber 2")
    public  void startNumber1(){
        MyRange myRange = new MyRange("(1,5)");
        int result = myRange.getStartNumber();
        assertEquals(2 , result);
    }

    @Test
    @DisplayName("ข้อมูล [1-5] getEndNumber 1")
    public  void endtNumber(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEndNumber();
        assertEquals(5 , result);
    }

    @Test
    @DisplayName("ข้อมูล (1-5) getEndNumber 2")
    public  void endNumber1(){
        MyRange myRange = new MyRange("(1,5)");
        int result = myRange.getEndNumber();
        assertEquals(4 , result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] genarateResponse 1,2,3,4,5")
    public  void genarateResponse(){
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.genarateResponse();
        assertEquals("1,2,3,4,5" , result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] genarateResponse 2,3,4,5")
    public  void genarateResponse1(){
        MyRange myRange = new MyRange("(1,5]");
        String result = myRange.genarateResponse();
        assertEquals("2,3,4,5" , result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] genarateResponse 1,2,3,4")
    public  void genarateResponse2(){
        MyRange myRange = new MyRange("[1,5)");
        String result = myRange.genarateResponse();
        assertEquals("1,2,3,4" , result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) genarateResponse 2,3,4")
    public  void genarateResponse3(){
        MyRange myRange = new MyRange("(1,5)");
        String result = myRange.genarateResponse();
        assertEquals("2,3,4" , result);
    }
}
