package org.superbiz.moviefun.albumsapi;

import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class AlbumFixtures {

    public List<AlbumInfo> load() {
        return asList(
                new AlbumInfo(null, "Massive Attack", "Mezzanine", 1998, 9),
                new AlbumInfo(null, "Radio head", "OK Computer", 1997, 8),
                new AlbumInfo(null, "Radio head", "Kid A", 2000, 9)
        );
    }
}
