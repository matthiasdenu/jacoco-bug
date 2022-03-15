import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestClass.class
})
public class TestSuite {
  @ClassRule
  public static InitializeConfigStuff initializeConfigStuff = new InitializeConfigStuff();
}
