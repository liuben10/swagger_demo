package com.swagger.demo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PolarCoordinate {
    @ApiModelProperty(value = "radius of polar coordinate")
    private Integer radius;

    @ApiModelProperty(value = "Angle of the polar coordinate")
    private Integer angle;

}
