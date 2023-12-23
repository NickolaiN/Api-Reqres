import io.qameta.allure.Description;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test09_PatchUpdate extends ResponseFile{
    @Test
    @Description("Патч тест")
    public void patchUpdate(){
        JSONObject request = new JSONObject();
        request.put("name","oliver");


        System.out.println(request);

        given()
                .body(request.toJSONString())
                .when().patch("https://reqres.in/api/users/2")
                .then().statusCode(200);
    }
}
