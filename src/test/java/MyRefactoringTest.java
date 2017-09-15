import org.testng.annotations.Test;
import steps.MainSteps;

public class MyRefactoringTest {
    MainSteps mainSteps = new MainSteps();

    @Test
    public void Test(){
        System.out.println("safasags");
        mainSteps.register();
    }

}
