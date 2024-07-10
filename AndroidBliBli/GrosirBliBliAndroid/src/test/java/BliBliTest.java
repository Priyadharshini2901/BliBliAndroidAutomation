import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/priyadharshini/IdeaProjects/GrosirBliBliAndroid/src/test/java/Feature/BliBli.feature",
        glue = {"StepDefinitions"}
)
public class BliBliTest {

}
