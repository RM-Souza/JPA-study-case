package com.example.jpaproject.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT("WAITING PAYMENT"),
    PAID("PAID"),
    SHIPPED("SHIPPED"),
    DELIVERED("DELIVERED"),
    CANCELED("CANCELED");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return status;
    }

    public static OrderStatus getStatus(String status) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.name().equals(status)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Status");
    }
}
