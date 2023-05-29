package com.example.demoship.entities.informations;

import com.example.demoship.entities.ShipGirl;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "ShipClassifications")
public class ShipClassification implements Serializable {
    @Id
    private String shipClassificationId;
    private String shipClassificationName;

    @OneToMany(mappedBy = "shipClassification")
    private List<ShipGirl> shipGirls;
}
