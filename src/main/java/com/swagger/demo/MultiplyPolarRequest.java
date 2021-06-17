package com.swagger.demo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

public class MultiplyPolarRequest {
    @Getter
    private final PolarCoordinate a;

    @Getter
    private final PolarCoordinate b;

    public MultiplyPolarRequest(PolarCoordinate a, PolarCoordinate b) {
        this.a = a;
        this.b = b;
    }
}
