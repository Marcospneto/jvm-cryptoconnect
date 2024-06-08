package br.com.jvm.consomecoingecko.controllers;
import br.com.jvm.consomecoingecko.dto.CoinDTO;
import br.com.jvm.consomecoingecko.services.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/coins")
@CrossOrigin(origins = "http://localhost:4200")
public class CoinController {
    @Autowired
    private CoinService coinService;

    @GetMapping("{coin}")
    public CoinDTO consultaCoinGecko(@PathVariable("coin") String coin) {
       return coinService.consultCoin(coin);
    }
}



