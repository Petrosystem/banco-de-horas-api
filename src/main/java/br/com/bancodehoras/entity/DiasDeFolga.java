package br.com.bancodehoras.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dias_de_folga")
public class DiasDeFolga {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "dia_de_folga_id")
    private Long diaDeFolgaId;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @Column(name = "data_folga_inicio")
    private Date dataFolgaInicio;

    @Column(name = "data_folga_fim")
    private Date dataFolgaFim;

    private String motivo;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;
}
