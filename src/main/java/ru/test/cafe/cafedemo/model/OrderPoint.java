package ru.test.cafe.cafedemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Класс Позиция заказа
 */
@Entity
@Data
public class OrderPoint {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * Сорт кофе
     */
    private String gradeName;
    /**
     * Число чашек
     */
    private Integer cupCounter;
    /**
     * Заказ
     */

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}

