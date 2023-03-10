package Automation.TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Objects;

public class ParametersAndDataProviders {
    @Test
    @Parameters({"username","password","results"})
//    @Parameters({"username","password"})
//    @Parameters({"username","password","results"})

//    public void parameterPractice(String uname,String pass,String res,String extra){
//    public void parameterPractice(String uname,String pass){
    public void parameterPractice(String uname,String pass,String res){
        System.out.println("I am from method parameterPractice and following parameters are provided to me");
        System.out.println("Username : " + uname);
        System.out.println("Password : " + pass);
        System.out.println("Result : " + res);
//        System.out.println("Extra : " + extra);
    }

    @DataProvider(name = "CityProvider")
    public Object[][] cp(){return new Object[][] {{"Pune"}, {"Mumbai"}, {"Nagpur"}};}

    @Test(dataProvider ="CityProvider")
    public void cityTestingSingleValueInEachSet (String cityName) {
        System.out.println("I am from cityTestingSingleValueInEachSet and Passed Data/City Is : " + cityName);
        Assert.assertTrue(cityName.length()>4,"Following City Name has length less than 5 : " + cityName);
        System.out.println("Case Pass : City Testing Single Value In Each Set");
    }

    @DataProvider(name = "CredentialProvider")
    public Object[][] credProvider(){
        Object[][] credentials=new Object[5][3];
        credentials[0] = new Object[]{"prashant", "nimje", "Valid"};
        credentials[1] = new Object[]{"Nimje", "Prashant", "InValid"};
        credentials[2] = new Object[]{"Data", "Provider", "Valid"};
        credentials[3] = new Object[]{"Selenium", "TestNG", "Valid"};
        credentials[4] = new Object[]{"Hello", "World", "InValid"};

        return credentials;
    }

    @Test (dataProvider = "CredentialProvider")
    public void credentialsTestingMultipleValueInEachSet (String uname,String pass,String res) {
        System.out.println("I am from method credentialsTestingMultipleValueInEachSet and following dataSet are provided to me");
        System.out.println("Username : " + uname);
        System.out.println("Password : " + pass);
        System.out.println("Result : " + res);
        Assert.assertTrue(res.equalsIgnoreCase("valid"),"Following credentials are wrong \nUsername : " + uname + "\nPassword : " + pass);
        System.out.println("Case Pass : Credentials Testing Multiple Value In Each Set");
    }

}
