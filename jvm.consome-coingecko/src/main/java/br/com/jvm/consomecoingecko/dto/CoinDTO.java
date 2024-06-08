package br.com.jvm.consomecoingecko.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinDTO {
    @JsonProperty("coinName")
    private String coinName;
    @JsonProperty("usd")
    private Double usd;
    @JsonProperty("usd_market_cap")
    private Double usd_market_cap;
    @JsonProperty("usd_24h_vol")
    private Double usd_24h_vol;
    @JsonProperty("usd_24h_change")
    private Double usd_24h_change;
    @JsonProperty("last_updated_at")
    private Long last_updated_at;

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getUsd_market_cap() {
        return usd_market_cap;
    }

    public void setUsd_market_cap(Double usd_market_cap) {
        this.usd_market_cap = usd_market_cap;
    }

    public Double getUsd_24h_vol() {
        return usd_24h_vol;
    }

    public void setUsd_24h_vol(Double usd_24h_vol) {
        this.usd_24h_vol = usd_24h_vol;
    }

    public Double getUsd_24h_change() {
        return usd_24h_change;
    }

    public void setUsd_24h_change(Double usd_24h_change) {
        this.usd_24h_change = usd_24h_change;
    }

    public Long getLast_updated_at() {
        return last_updated_at;
    }

    public void setLast_updated_at(Long last_updated_at) {
        this.last_updated_at = last_updated_at;
    }
}
