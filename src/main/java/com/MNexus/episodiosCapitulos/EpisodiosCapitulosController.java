package com.MNexus.episodiosCapitulos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/episodios")
public class EpisodiosCapitulosController {
    @Autowired
    private EpisodiosCapitulosService episodiosCapitulosService;

    //Metodo create
    @PostMapping("/")
    public EpisodiosCapitulos save(@RequestBody EpisodiosCapitulos entity)
    {
        return episodiosCapitulosService.save(entity);
    }

    //Metodo select
    @GetMapping("/{id}/")
    public EpisodiosCapitulos findById(@PathVariable Long id)
    {
        return episodiosCapitulosService.findById(id);
    }

    //Metodo select all
    @GetMapping("/all")
    public List<EpisodiosCapitulos> findAll() {
        return episodiosCapitulosService.findAll();
    }

    //Metodo update
    @PutMapping("/u")
    public EpisodiosCapitulos update(@RequestBody EpisodiosCapitulos Entity)
    {
        return episodiosCapitulosService.save(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void delete(@PathVariable Long id) {
        episodiosCapitulosService.deleteById(id);
    }
}
