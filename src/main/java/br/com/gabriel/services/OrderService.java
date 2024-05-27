package br.com.gabriel.services;

import br.com.gabriel.entities.Order;
import br.com.gabriel.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}
