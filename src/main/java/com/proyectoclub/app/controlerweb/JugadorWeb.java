package com.proyectoclub.app.controlerweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyectoclub.app.repository.JugadorCrud;
import com.proyectoclub.app.variables.Jugador;

@Controller
public class JugadorWeb {

    @Autowired
    private JugadorCrud jugadorRepositorio;

    @GetMapping({"/verJugador"})  
    public String verJugador(Model model) {
        List<Jugador> listarJugador = jugadorRepositorio.findAll();
        model.addAttribute("listarJugador", listarJugador);
        
        return "verJugador";
    }

    @GetMapping("/verJugador/formJugador")
    public String mostrarFormulario(Model model) {
        model.addAttribute("jugador", new Jugador());
        return "formJugador";
    }

    @PostMapping("/guardarJugador")
    public String guardarJugador(Jugador jugador) {
        jugadorRepositorio.save(jugador);
        return "redirect:/verJugador";
    }

    @GetMapping("/jugador/editar/{id}")
    public String modificarJugador(@PathVariable("id") Integer id, Model model) {
        Jugador jugador = jugadorRepositorio.findById(id).orElse(null);
        if (jugador != null) {
            model.addAttribute("jugador", jugador);
            return "formJugador";
        } else {
            return "redirect:/verJugador";
        }
    }

    @GetMapping("/jugador/eliminar/{id}")
    public String eliminarJugador(@PathVariable("id") Integer id) {
        jugadorRepositorio.deleteById(id);
        return "redirect:/verJugador";
    }
}

