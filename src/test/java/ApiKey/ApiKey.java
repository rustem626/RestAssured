package ApiKey;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class ApiKey {
    @Test
    public void test1(){

        given()
                .header("x-api-key","GwMco9Tpstd5vbzBzlzW9I7hr6E1D7w2zEIrhOra")
                .when()
                .get("https://l9njuzrhf3.execute-api.eu-west-1.amazonaws.com/prod/user")

                .then()
                .log().body()
        ;
    }

    

}
