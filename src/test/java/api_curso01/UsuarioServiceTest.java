package api_curso01;

import api_curso01.model.Usuario;
import api_curso01.repository.UsuarioRepository;
import api_curso01.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @Mock
    UsuarioRepository repository;

    @InjectMocks
    UsuarioService service;

    @Test
    void deberiaRetornarUsuarios() {

        // 1. Definir comportamiento del mock
        when(repository.findAll())
                .thenReturn(List.of(new Usuario(1L, "Maxi","Correo@gmail.com")));

        // 2. Ejecutar método
        List<Usuario> resultado = service.obtenerUsuarios();

        // 3. Verificar resultado
        assertEquals(1, resultado.size());
        assertEquals("Maxi", resultado.get(0).getNombre());

        // 4. Verificar interacciónw
        verify(repository).findAll();
    }
}