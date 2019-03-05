import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;

public class Show {
    Integer id;
    String url;
    String name;
    String type;
    String language;
    String[] genres;
    String status;
    Integer runtime;
    String premiered;
    String officialSite;
    Schedule schedule;
    Rating rating;
    Integer weight;
    String network;
    WebChannel webChannel;
    Externals externals;
    Episode.Image image;
    String summary;
    Integer updated;
    Links _links;
    Embedded _embedded;


    class Schedule {
        String time;
        String[] days;

        Schedule() {

        }
    }

    public class InstanceCreatorForSchedule implements InstanceCreator<Schedule> {
        private final Show show;
        public InstanceCreatorForSchedule (Show show) {
            this.show = show;
        }
        public Show.Schedule createInstance(Type type) {
            return show.new Schedule();
        }
    }

    class Rating {
        Float average;

        Rating() {

        }
    }

    public class InstanceCreatorForRating implements InstanceCreator<Rating> {
        private final Show show;
        public InstanceCreatorForRating (Show show) {
            this.show = show;
        }
        public Show.Rating createInstance(Type type) {
            return show.new Rating();
        }
    }

    class WebChannel {
        Integer id;
        String name;
        String country;

        WebChannel() {

        }
    }

    public class InstanceCreatorForWebChannel implements InstanceCreator<WebChannel> {
        private final Show show;
        public InstanceCreatorForWebChannel (Show show) {
            this.show = show;
        }
        public Show.WebChannel createInstance(Type type) {
            return show.new WebChannel();
        }
    }

    class Externals {
        Integer tvrage;
        Integer thetvdb;
        String imdb;

        Externals() {

        }
    }

    public class InstanceCreatorForExternals implements InstanceCreator<Externals> {
        private final Show show;
        public InstanceCreatorForExternals (Show show) {
            this.show = show;
        }
        public Show.Externals createInstance(Type type) {
            return show.new Externals();
        }
    }

    class Embedded {
        Episode[] episodes;

        Embedded() {

        }
    }

    public class InstanceCreatorForEmbedded implements InstanceCreator<Embedded> {
        private final Show show;
        public InstanceCreatorForEmbedded (Show show) {
            this.show = show;
        }
        public Show.Embedded createInstance(Type type) {
            return show.new Embedded();
        }
    }

    public class Links {
        Self self;
        PreviousEpisode previousepisode;

        class Self {
            String href;

            Self() {

            }
        }

        class PreviousEpisode {
            String href;

            PreviousEpisode() {

            }
        }

        Links() {

        }
    }

    public class InstanceCreatorForLinks implements InstanceCreator<Show.Links> {
        private final Show show;
        public InstanceCreatorForLinks (Show show) {
            this.show = show;
        }
        public Show.Links createInstance(Type type) {
            return show.new Links();
        }
    }

    public class InstanceCreatorForSelf implements InstanceCreator<Links.Self> {
        private final Links links;
        public InstanceCreatorForSelf (Links links) {
            this.links = links;
        }
        public Links.Self createInstance(Type type) {
            return links.new Self();
        }
    }

    public class InstanceCreatorForPreviousEpisode implements InstanceCreator<Links.PreviousEpisode> {
        private final Links links;
        public InstanceCreatorForPreviousEpisode (Links links) {
            this.links = links;
        }
        public Links.PreviousEpisode createInstance(Type type) {
            return links.new PreviousEpisode();
        }
    }
}
