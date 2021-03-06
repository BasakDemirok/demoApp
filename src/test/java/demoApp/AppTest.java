/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demoApp;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testFound() {
       ArrayList<String> array = new ArrayList<>(Arrays.asList("a","b","c","d","c"));
       assertTrue(App.findWordGivenRange(array, 2,4, "d"));
     }
 
     @Test
     public void testNotFound() {
       ArrayList<String> array = new ArrayList<>(Arrays.asList("a","b","c","d","c"));
       assertFalse(App.findWordGivenRange(array, 0,2,"d"));
     }
 
     @Test
     public void testEmptyArray() {
       ArrayList<String> array = new ArrayList<>();
       assertFalse(App.findWordGivenRange(array, 5,7,"f"));
     }
 
     @Test
     public void testNull() {
       assertFalse(App.findWordGivenRange(null, 1,3,"g"));
     }

     @Test
     public void testReverse() {
       ArrayList<String> array = new ArrayList<>(Arrays.asList("a","b","c","d","c"));
       assertFalse(App.findWordGivenRange(array, 5,2,"b"));
     }
 
 
}
