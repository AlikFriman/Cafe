package ru.test.cafe.cafedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.cafe.cafedemo.model.OrderPoint;

@Repository
public interface OrderPointRepository extends JpaRepository<OrderPoint, Long> {
}
