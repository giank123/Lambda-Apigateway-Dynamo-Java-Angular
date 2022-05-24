package com.tutorial.dynamocrud;

import lombok.Data;

@Data
public class Request {

    private int id;

    private String httpMethod;

    private Producto producto;
}
