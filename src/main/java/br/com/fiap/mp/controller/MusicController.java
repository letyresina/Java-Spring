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

        String letra = "Baby, you can drive my car\n" +
                "Yes, I'm gonna be a star\n" +
                "Baby, you can drive my car\n" +
                "And maybe I love you\n" +
                "\n" +
                "I told that girl that my prospects were good\n" +
                "And she said: Baby, it's understood\n" +
                "Working for peanuts is all very fine\n" +
                "But I can show you a better time";

        model.addAttribute("musica", letra);

        return "musica";
    }
}
