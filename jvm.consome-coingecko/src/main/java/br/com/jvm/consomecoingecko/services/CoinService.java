package br.com.jvm.consomecoingecko.services;

import br.com.jvm.consomecoingecko.dto.CoinDTO;
import br.com.jvm.consomecoingecko.dto.CoinGeckoResponseDTO;
import br.com.jvm.consomecoingecko.models.Coin;
import br.com.jvm.consomecoingecko.repositories.CoinRepository;
import br.com.jvm.consomecoingecko.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinService {

    @Autowired
    private CoinRepository coinRepository;

    public CoinDTO consultCoin(String coin) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("https://api.coingecko.com/api/v3/simple/price?ids=" +
                "%s&vs_currencies=usd&include_market_cap=true&include_24hr_vol=true&include_24hr_change=true&include_last_updated_at=true", coin);
        ResponseEntity<CoinGeckoResponseDTO> resp = restTemplate
                .getForEntity(url, CoinGeckoResponseDTO.class);
        CoinGeckoResponseDTO response = resp.getBody();
        if (response != null && response.getCoins().containsKey(coin)) {
            CoinDTO coinDTO = new CoinDTO();
            coinDTO = response.getCoins().get(coin);
            coinDTO.setCoinName(coin);
            insertCoin(coinDTO);
            return coinDTO;


        } else {
            throw new ResourceNotFoundException(coin);
        }
    }

    public void insertCoin(CoinDTO coinDTO){
        if(coinDTO.getUsd() == null){
            throw new RuntimeException();
        }
        Coin coin = new Coin();
        coin.setCoin(coinDTO.getCoinName());
        coin.setUsd(coinDTO.getUsd());
        coin.setUsd_market_cap(coinDTO.getUsd_market_cap());
        coin.setUsd_24h_vol(coinDTO.getUsd_24h_vol());
        coin.setUsd_24h_change(coinDTO.getUsd_24h_change());
        coin.setLast_updated_at(coinDTO.getLast_updated_at());

        coinRepository.save(coin);
    }

}
