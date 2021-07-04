package com.dio.SantanderFullStack.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {

    @Id
    private long id;

    @ManyToOne
    private TipoData tipoData;

    private String descricao;
    private LocalDateTime dataEspecial;
}
