import com.google.gson.*;

import java.awt.*;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TvTime {

    public static String parseEpisode(String episodeUnformattedJson) {
        String blackMirrorEpisodeData = Data.getFileContentsAsString("blackmirror.json");
        System.out.println(blackMirrorEpisodeData);

        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        Episode episode = gson.fromJson(episodeUnformattedJson, Episode.class);
        System.out.println(episode.toString());
        return gson.toJson(episode);
    }

    public static String parseEpisodes(String episodesJson) {
        System.out.println(episodesJson);
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        Episode[] episodes = gson.fromJson(episodesJson, Episode[].class);
        return gson.toJson(episodes);
    }
}
