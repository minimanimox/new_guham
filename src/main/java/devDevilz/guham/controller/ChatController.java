package devDevilz.guham.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    public String chat(){

        return "chat";
    }
}
