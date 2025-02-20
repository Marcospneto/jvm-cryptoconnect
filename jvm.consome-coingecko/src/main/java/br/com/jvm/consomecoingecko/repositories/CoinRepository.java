package br.com.jvm.consomecoingecko.repositories;

import br.com.jvm.consomecoingecko.models.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {
}
