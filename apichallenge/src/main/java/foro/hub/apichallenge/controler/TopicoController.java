package foro.hub.apichallenge.controler;

import foro.hub.apichallenge.topico.DatosRegistroTopico;
import foro.hub.apichallenge.topico.Topico;
import foro.hub.apichallenge.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico) {
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

}
