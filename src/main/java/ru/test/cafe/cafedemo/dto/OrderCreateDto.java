package ru.test.cafe.cafedemo.dto;

import java.util.List;

/**
 * Данные для создания заказа
 */
public class OrderCreateDto {
    private String address;
    private String name;
    private List<OrderPointDto> points;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderPointDto> getPoints() {
        return points;
    }

    public void setPoints(List<OrderPointDto> points) {
        this.points = points;
    }
}
