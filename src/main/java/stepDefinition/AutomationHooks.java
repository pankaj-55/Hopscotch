package stepDefinition;

import java.io.IOException;

import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import base.PredefinedActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


public class AutomationHooks {

    PredefinedActions predefinedActions = new PredefinedActions();
    public static String browserName;
    public static boolean useWebdriverManager;
    public static boolean runHeadless;
    public static String environment;

    @Before
    public void setUp() throws IOException, XmlPullParserException {
        browserName = System.getProperty("browserName", "edge");
        useWebdriverManager = Boolean.parseBoolean(System.getProperty("useWebdriverManager", "true"));
        runHeadless = Boolean.parseBoolean(System.getProperty("runHeadless", "false"));
        environment = System.getProperty("environment", "client");

        predefinedActions.start();

    }

   @After
   public void tearDown(Scenario scenario) {
       if (scenario.isFailed()) {
            scenario.attach(predefinedActions.takeScreenshot(), "image/jpeg", "Screen Shot");
            System.out.println("Scenario - "+scenario.getName());
            //createJiraTicket(scenario.getName());
       }

       predefinedActions.tearDown();
   }


}
