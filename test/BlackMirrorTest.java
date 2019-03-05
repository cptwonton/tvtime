import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BlackMirrorTest {

    @Test
    public void simpleEpisode() throws Exception {
        assertEquals("{\"id\":1281043,\"url\":\"http://www.tvmaze.com/episodes/1281043/black-mirror-4x05-metalhead\",\"name\":\"Metalhead\",\"season\":4,\"number\":5,\"airdate\":\"2017-12-29\",\"airtime\":\"\",\"airstamp\":\"2017-12-29T12:00:00+00:00\",\"runtime\":41,\"image\":{\"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/140/350996.jpg\",\"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/140/350996.jpg\"},\"summary\":\"<p>In a post-apocalyptic England, three scavengers break into a warehouse. Two of them are killed by a robot \"dog\" drone, which relentlessly hunts the survivor.</p>\",\"_links\":{\"self\":{\"href\":\"http://api.tvmaze.com/episodes/1281043\"}}}",
                TvTime.parseEpisode("{\"id\":1281043,\"url\":\"http://www.tvmaze.com/episodes/1281043/black-mirror-4x05-metalhead\",\"name\":\"Metalhead\",\"season\":4,\"number\":5,\"airdate\":\"2017-12-29\",\"airtime\":\"\",\"airstamp\":\"2017-12-29T12:00:00+00:00\",\"runtime\":41,\"image\":{\"medium\":\"http://static.tvmaze.com/uploads/images/medium_landscape/140/350996.jpg\",\"original\":\"http://static.tvmaze.com/uploads/images/original_untouched/140/350996.jpg\"},\"summary\":\"<p>In a post-apocalyptic England, three scavengers break into a warehouse. Two of them are killed by a robot \\\"dog\\\" drone, which relentlessly hunts the survivor.</p>\",\"_links\":{\"self\":{\"href\":\"http://api.tvmaze.com/episodes/1281043\"}}}"));
    }

}
