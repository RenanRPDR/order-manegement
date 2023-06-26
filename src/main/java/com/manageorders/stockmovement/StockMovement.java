package com.manageorders.stockmovement;

import com.manageorders.item.Item;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "stock_movements")
public class StockMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime creationDate;
    @ManyToOne
    private Item item;
    private Integer quantity;
}
