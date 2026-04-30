package api_curso01.repository;

import api_curso01.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {
    public List<Usuario> findAll(){
        return List.of(new Usuario(1L,"Maximiliano Bozzalla","maximiliano.bozzalla@gmail.com"),
                        new Usuario(2L, "Guillermo Areco","guillermo.areco@gmail.com")
        );
    }
}
