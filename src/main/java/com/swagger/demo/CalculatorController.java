package com.swagger.demo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    @GetMapping("/add")
    @ApiOperation(value = "Takes two integers and adds them together", response=Integer.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message="Successfully added"),
            @ApiResponse(code = 405, message="Invalid integer params"),
            @ApiResponse(code = 500, message="Internal Server error"),
    })
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return a + b;
    }

    @PostMapping("/multiplyPolar")
    @ApiOperation(value = "Takes two polar coordinates and multiplies them together", response=PolarCoordinate.class)
    public PolarCoordinate multiplyPolar(@RequestBody MultiplyPolarRequest multiplyRequest) {
        return new PolarCoordinate(
                multiplyRequest.getA().getRadius() * multiplyRequest.getB().getRadius(),
                multiplyRequest.getA().getAngle() + multiplyRequest.getB().getAngle()
        );
    }
}
