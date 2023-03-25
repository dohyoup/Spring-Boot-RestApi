package com.study.domain.search;

import lombok.Getter;

import java.util.Date;

@Getter
public class OrderResponse {
    private String orderCode;
    private String product;
    private Date orderDate;
}
