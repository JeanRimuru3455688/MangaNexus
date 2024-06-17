package com.MNexus.episodiosCapitulos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EpisodiosCapitulosService {

    @Autowired
    private EpisodiosCapitulosRepository episodiosCapitulosRepository;

    //CRUD
    //metodo insert
    public EpisodiosCapitulos save(EpisodiosCapitulos entity) {
        return episodiosCapitulosRepository.save(entity);
    }

    //metodo select
    public EpisodiosCapitulos findById(Long id) {
        return episodiosCapitulosRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<EpisodiosCapitulos> findAll() {
        Iterable<EpisodiosCapitulos> iterable = episodiosCapitulosRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void deleteById(Long id) {
        episodiosCapitulosRepository.deleteById(id);
    }
}
