package com.containerstore.prestonintegrations.ordercreation.OrderApplication.Controller;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.Service.ForwardShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private ForwardShippingService forwardShippingService;


    @GetMapping("/{num}")
    public LocalDateTime getShippingDate(@PathVariable Integer num){
        return forwardShippingService.getShippingDate(num);
    }
}
