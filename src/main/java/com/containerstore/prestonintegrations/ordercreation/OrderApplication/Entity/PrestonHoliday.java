package com.containerstore.prestonintegrations.ordercreation.OrderApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "preston_holiday")
public class PrestonHoliday {

    @Id
    @GeneratedValue
    private int id;
    private String holiday;
    private LocalDateTime holiday_date;
}
