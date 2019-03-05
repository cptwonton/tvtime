import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;

public class Episode {
    Integer id;
    String url;
    String name;
    Integer season;
    Integer number;
    String airdate;
    String airtime;
    String airstamp;
    Integer runtime;
    Image image;
    String summary;
    Links _links;

    class Image {
        String medium;
        String original;

        Image() {

        }
    }

    public class Links {
        Self self;

        class Self {
            String href;

            Self() {

            }
        }

        Links() {

        }
    }

    public class InstanceCreatorForImage implements InstanceCreator<Episode.Image> {
        private final Episode episode;
        public InstanceCreatorForImage (Episode episode) {
            this.episode = episode;
        }
        public Episode.Image createInstance(Type type) {
            return episode.new Image();
        }
    }

    public class InstanceCreatorForLinks implements InstanceCreator<Episode.Links> {
        private final Episode episode;
        public InstanceCreatorForLinks (Episode episode) {
            this.episode = episode;
        }
        public Episode.Links createInstance(Type type) {
            return episode.new Links();
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
}
