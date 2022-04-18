import org.testng.annotations.Test;

/**
 * @author chandikah
 * on 2022-03-23
 */
public class TestExecuter {
    @Test(description = "testVerifyFindWordOccurrences", alwaysRun = true, priority = 1)
    public void testVerifyFindWordOccurrences() {
        ArrayQuestions.findWordOccurrences("hello", "Hello this is a test hello World");
    }


}
