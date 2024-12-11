package br.com.fujideia.iesp.tecback.classe.DTO;

import br.com.fujideia.iesp.tecback.model.DTO.FilmeDTO;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class CinematografiaDTO {


        private Long id;
        private String diretorDeFotografia;
        private String estilo;
        private FilmeDTO Cinematografia;
        private List<String> premios;

}
