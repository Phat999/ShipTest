package com.example.demoship.entities.informations;

import com.example.demoship.entities.ShipGirl;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "ShipClasses")
public class ShipClass implements Serializable {
    @Id
    private String shipClassId;
    private String shipClassName;

    @OneToMany(mappedBy = "shipClass")
    private List<ShipGirl> shipGirls;
}
