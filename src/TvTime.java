import com.google.gson.*;

import java.awt.*;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TvTime {

    public static String parseEpisode(String episodeJson) {
        //String blackMirrorEpisodeData = Data.getFileContentsAsString("blackmirror.json");
        System.out.println(episodeJson);
        Gson gson = new Gson();
        Episode episode = gson.fromJson(episodeJson, Episode.class);
        System.out.println(episode.toString());
        return episode.toString();
    }
}
