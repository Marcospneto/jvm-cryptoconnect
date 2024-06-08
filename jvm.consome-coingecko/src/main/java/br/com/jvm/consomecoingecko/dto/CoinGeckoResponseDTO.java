package br.com.jvm.consomecoingecko.dto;

import br.com.jvm.consomecoingecko.models.Coin;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.HashMap;
import java.util.Map;

public class CoinGeckoResponseDTO {

    private Map<String, CoinDTO> coins = new HashMap<>();

    @JsonAnySetter
    public void addCoin(String key, CoinDTO value) {
        coins.put(key, value);
    }

    public Map<String, CoinDTO> getCoins() {
        return coins;
    }

    public void setCoins(Map<String, CoinDTO> coins) {
        this.coins = coins;
    }
}
