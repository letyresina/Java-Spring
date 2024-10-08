package br.com.fiap.mp.controller;


import br.com.fiap.mp.Model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home") //localhost:8080/home
public class HomeController {

    @GetMapping
    public String home(Model model){

        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Big Mac");
        pedido.setUrlImagem("https://cache-backend-mcd.mcdonaldscupones.com/media/image/product$kzXCTbnv/200/200/original?country=br");
        pedido.setUrlProduto("https://www.mcdonalds.com.br/cardapio/sanduiches-de-carne-bovina/big-mac");
        pedido.setDescricao("Dois hambúrgueres (100% carne bovina), alface americana, queijo processado sabor cheddar, molho especial, cebola, picles e pão com gergelim.");
        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedido);
        return "home";
    }
}
