import io.qameta.allure.Description;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test13_PostLoginSuccess {

    @Test
    @Description("Вход")
    public void postLoginSuccess(){
        JSONObject request = new JSONObject();
        request.put("email","eve.holt@reqres.in");
        request.put("password","testPass");

        given()
                .body(request.toJSONString())
                .when()
                .header("Content-Type", "application/json")
                .post("https://reqres.in/api/login")
                .then()
                .statusCode(200)
                .log().body();
    }
}
