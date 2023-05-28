package com.example.demoship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ShipGirls")
public class ShipGirls implements Serializable {
    @Id
    private String shipId;
    private String shipName;
    private String shipContruction;
}
