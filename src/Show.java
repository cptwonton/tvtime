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
}
