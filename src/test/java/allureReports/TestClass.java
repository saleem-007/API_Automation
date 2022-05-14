package allureReports;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;


public class TestClass extends UtilClass {

    @Test
    public void getMigrationStatus() throws ParseException {
         Response response=given().header(Endpoints.CONTENT_TYPE, Endpoints.CONTENT_VALUE).header(Endpoints.HEADER_KEY, Endpoints.HEADER_VALUE)
                   .baseUri(Endpoints.HDFC_BETA).basePath(Endpoints.MIGRATION_BASE_PATH).when()
                   .get(Endpoints.DEMOGRAPHY_ENDPOINT+ Endpoints.PHONE_NUMBER)
                   .then().statusCode(200).extract().response();
         Boolean boo= response.path("isRecordAvailable");
        if (boo)
        {
            System.out.println("Record is available = "+response.asString());
        }
        else
        {
            System.out.println("Record is not available");
        }
    }
}
