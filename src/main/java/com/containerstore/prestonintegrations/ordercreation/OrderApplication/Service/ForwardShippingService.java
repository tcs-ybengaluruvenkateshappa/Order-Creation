package com.containerstore.prestonintegrations.ordercreation.OrderApplication.Service;

import com.containerstore.prestonintegrations.ordercreation.OrderApplication.Repository.PrestonHolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ForwardShippingService {

    @Autowired
    private PrestonHolidayRepository prestonHolidayRepository;

    public LocalDateTime getShippingDate(int totalNumberOfDays){

        LocalDateTime date = LocalDateTime.now();

        var lst = prestonHolidayRepository.findAllDates();

        System.out.println(lst);

        for(int i = 1; i <= totalNumberOfDays; i++){
            if(date.getDayOfWeek().toString() == "SUNDAY" || date.getDayOfWeek().toString() == "SATURDAY"){
                i = i - 1;
            }
            date = date.plusDays(1);
        }
        return date;
    }

}
