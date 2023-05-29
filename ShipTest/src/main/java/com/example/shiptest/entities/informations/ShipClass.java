package com.example.shiptest.entities.informations;

import com.example.shiptest.entities.ShipGirl;
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
@Table(name = "ShipClasses")
public class ShipClass implements Serializable {
    @Id
    private String shipClassId;
    private String shipClassName;

    @OneToMany(mappedBy = "shipClass")
    private List<ShipGirl> shipGirls;
}
