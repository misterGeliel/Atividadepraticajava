package br.com.fujideia.iesp.tecback.classe;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Premio {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int ano;
    private String categoria;
    private String vencedor;

    @ManyToOne
    @JoinColumn(name = "Premio")
    private List<Filme> filmes;
}