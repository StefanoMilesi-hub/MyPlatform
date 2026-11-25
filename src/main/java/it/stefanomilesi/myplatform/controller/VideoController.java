package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.Video;
import it.stefanomilesi.myplatform.repository.VideoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videos")
public class VideoController extends CrudRestController<Video> {

    public VideoController(VideoRepository repository) {
        super(repository);
    }
}
