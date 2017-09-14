import org.testng.annotations.Test;
import steps.MainSteps;

public class MyRefactoringTest {
    MainSteps mainSteps = new MainSteps();

    @Test
    public void Test(){
        mainSteps.registrate();
    }

}
