package br.com.jvm.consomecoingecko.models;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import java.io.Serial;
import java.io.Serializable;
@Entity
@Table(name = "coins")
public class Coin implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "coin")
    @NotBlank
    private String coin;
    @Column(name = "usd")
    @NotBlank
    private Double usd;
    @Column(name = "usdMarketCap")
    @NotBlank
    private Double usd_market_cap;
    @Column(name = "usd24Vol")
    @NotBlank
    private Double usd_24h_vol;
    @Column(name = "usd24hChange")
    @NotBlank
    private Double usd_24h_change;
    @Column(name = "lastUpdateAt")
    @NotBlank
    private Long last_updated_at;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
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
