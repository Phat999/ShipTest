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
@Table(name = "ShipFactions")
public class ShipFaction implements Serializable {
    @Id
    private String shipFactionId;
    private String shipFactionName;

    @OneToMany(mappedBy = "shipFaction")
    private List<ShipGirl> shipGirls;
}
