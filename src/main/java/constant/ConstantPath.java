package constant;
import stepDefinition.AutomationHooks;

public class ConstantPath {

    public static final String hopscotch_URL = getHopscotchURL(AutomationHooks.environment);

    public static final String email_superAdmin = "";

    public static final String password = "1233";

    private static final String BASDIR = ".\\src\\main\\java\\config\\";

    public static final String SIGNINPAGELOCATORS=BASDIR+"SignInPageLocators.properties";

    public static final String CHROMEDRIVER = "repace with chromedriver path";
    public static final String EDGEDRIVER = "repace with edgedriver path";
    public static final String GICODRIVER = "repace with gicodriver path";

    public static String getHopscotchURL(String environment){
        switch (environment){
            case "client":
                return "https://dev-client.hopscotchconnect.com/";
            case "provider":
                return "https://dev-provider.hopscotchconnect.com/";
            default:
                return "https://dev-client.hopscotchconnect.com/";
        }
    }
}
