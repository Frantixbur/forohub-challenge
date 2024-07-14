package foro.hub.apichallenge.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String id_usuario;
    private String mensaje;
    private String nombre_curso;
    private String titulo;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.id_usuario = datosRegistroTopico.id_usuario();
        this.mensaje = datosRegistroTopico.mensaje();
        this.nombre_curso = datosRegistroTopico.nombre_curso();
        this.titulo = datosRegistroTopico.titulo();
    }
}