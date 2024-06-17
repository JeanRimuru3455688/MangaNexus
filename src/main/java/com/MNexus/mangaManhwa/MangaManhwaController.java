package com.MNexus.mangaManhwa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/manga")
public class MangaManhwaController {
    @Autowired
    private MangaManhwaService mangaManhwaService;

    //Metodo create
    @PostMapping("/")
    public MangaManhwa save(@RequestBody MangaManhwa entity)
    {
        return mangaManhwaService.save(entity);
    }

    //Metodo select
    @GetMapping("/{id}/")
    public MangaManhwa findById(@PathVariable Long id)
    {
        return mangaManhwaService.findById(id);
    }

    //Metodo select all
    @GetMapping("/all")
    public List<MangaManhwa> findAll() {
        return mangaManhwaService.findAll();
    }

    //Metodo update
    @PutMapping("/u")
    public MangaManhwa update(@RequestBody MangaManhwa Entity)
    {
        return mangaManhwaService.save(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void delete(@PathVariable Long id) {
        mangaManhwaService.deleteById(id);
    }
}
