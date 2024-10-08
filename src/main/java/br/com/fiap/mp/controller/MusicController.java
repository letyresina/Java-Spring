package br.com.fiap.mp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music") // localhost:8080/music
public class MusicController {

    @GetMapping
    public String musica(Model model){
        return "musica";
    }
}
