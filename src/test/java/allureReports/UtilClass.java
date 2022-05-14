package allureReports;

import allureReports.Endpoints;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class UtilClass extends Endpoints {
    public static JSONObject getJsonObject(String path) throws IOException, ParseException {
        JSONParser jsonParser=new JSONParser();
        FileReader reader=new FileReader(path);
        System.out.println(reader);
        JSONObject obj=(JSONObject) jsonParser.parse(reader);
        return obj;

    }
}
