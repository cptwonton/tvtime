import com.google.gson.*;

public class TvTime {

    public static String parseEpisode(String episodeUnformattedJson) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        Episode episode = gson.fromJson(episodeUnformattedJson, Episode.class);
        return gson.toJson(episode);
    }

    public static String parseEpisodes(String episodesJson) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        Episode[] episodes = gson.fromJson(episodesJson, Episode[].class);
        return gson.toJson(episodes);
    }

    public static String parseShow(String showJson) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().serializeNulls().create();
        Show show = gson.fromJson(showJson, Show.class);
        return gson.toJson(show);
    }
}
