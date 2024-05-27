package br.com.gabriel.repositories;

import br.com.gabriel.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
