package com.tutorial.dynamocrud;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "producto")
public class Producto {

    @DynamoDBHashKey
    private int id;

    @DynamoDBAttribute
    private String nombre;

    @DynamoDBAttribute
    private String precio;
}
