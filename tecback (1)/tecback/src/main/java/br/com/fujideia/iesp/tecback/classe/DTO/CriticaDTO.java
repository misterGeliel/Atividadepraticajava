package br.com.fujideia.iesp.tecback.classe.DTO;

import br.com.fujideia.iesp.tecback.model.DTO.FilmeDTO;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CriticaDTO {



        private Long id;
        private String autor;
        private int nota;
        private String comentario;
        private FilmeDTO filme;


}
