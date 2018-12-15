package training;



import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    driverclass DClass = new driverclass();

    @Before
    public void openbrowser(){
        DClass.opendriver();
    }

    @After

    public void closebrowser(){
        DClass.closedriver();
    }
}
