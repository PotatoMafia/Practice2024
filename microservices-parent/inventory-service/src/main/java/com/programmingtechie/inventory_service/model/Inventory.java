package com.programmingtechie.inventory_service.model;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "t_inventory")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;
}
