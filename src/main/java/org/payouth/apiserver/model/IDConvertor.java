package org.payouth.apiserver.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

public class IDConvertor implements DynamoDBTypeConverter<Integer, String> {
    @Override
    public Integer convert(String s) {
        return Integer.valueOf(s);
    }

    @Override
    public String unconvert(Integer integer) {
        return integer.toString();
    }
}
