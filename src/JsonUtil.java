/* * * * * * * * * * * * * * * * * * * * * * * *
 * Instituto Tecnológico de Costa Rica         *
 * Data structures                             *
 * 1st Project: Domino´s game                  *
 * by: Fabián Zamora R. and Randald Villegas B.*
 * * * * * * * * * * * * * * * * * * * * * * * */

//
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Fabián
 */

//method for convert an java object to json
public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();
  
    public static String converPlayerToJson(Player nPlayer){
        String jsonResult = "";
        try {
            jsonResult = mapper.writeValueAsString(nPlayer);
        } catch (IOException e) {
         
        }
        return jsonResult;
    }
    //method for convert an json file to java object
    public static <T> T convertJsontoJava(String jsonLine, Class<T> cls){
        T result = null;
        try {
            result = mapper.readValue(jsonLine, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    //method for convert an object victory to json
    public static String converVictoryToJson(Victory nPlayer){
        String jsonResult = "";
        try {
            jsonResult = mapper.writeValueAsString(nPlayer);
        } catch (IOException e) {
         
        }
        return jsonResult;
    }
    
    
}
