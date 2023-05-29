package com.example.demoship.entities;

import com.example.demoship.entities.informations.ShipClass;
import com.example.demoship.entities.informations.ShipClassification;
import com.example.demoship.entities.informations.ShipFaction;
import com.example.demoship.entities.informations.ShipRarity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "ShipGirls")
public class ShipGirl implements Serializable {
    @Id
    private String shipGirlsId;
    private String shipGirlsName;
    private String shipGirlsContruction;

    @ManyToOne
    @JoinColumn(name = "shipRarityId")
    private ShipRarity shipRarity;

    @ManyToOne
    @JoinColumn(name = "shipClassificationId")
    private ShipClassification shipClassification;

    @ManyToOne
    @JoinColumn(name = "shipFactionId")
    private ShipFaction shipFaction;

    @ManyToOne
    @JoinColumn(name = "shipClassId")
    private ShipClass shipClass;

    private String shipVoiceActor;
    private String shipIllustrator;
}
