package day6;

import day4.BaseTest;
import org.testng.annotations.Test;

public class RestoranteTests  extends BaseTest {

    @Test
    public void test_CreateUserAndLogin() {
        String rest_Id = "";
        String email = "";
        String password = "";

        String url = "";
        String params = "";
        String requestBody = "";

        String response = executeHttpRequest(url, params, requestBody);

        rest_Id = getKeyValue("rest_Id", response);
        email = getKeyValue("email", response);
        password = getKeyValue("password", response);


        openPage("http://52.9.182.211:3001/v1/log-in");


    }
    // TODO: get values from JSON response
    private String getKeyValue(String password, String response) {
        String keyValue = " ";

        ////

        return keyValue;
    }

    //TODO : make Http Request (same way we did in Postman)
    private String executeHttpRequest(String url, String params, String requestBody) {
        String result = "";

        ////

        return result;
    }
}
