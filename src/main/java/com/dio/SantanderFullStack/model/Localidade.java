package com.dio.SantanderFullStack.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    private long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
