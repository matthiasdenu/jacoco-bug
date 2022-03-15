import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class InitializeConfigStuff implements TestRule {

  @Override
  public Statement apply(final Statement statement, final Description description) {
    return new Statement() {
      @Override
      public void evaluate() throws Throwable {
            System.setProperty("IS_APP_RUNNING", "YES");
        statement.evaluate();
      }
    };
  }
}