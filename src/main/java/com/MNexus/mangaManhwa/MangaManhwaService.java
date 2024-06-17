package com.MNexus.mangaManhwa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class MangaManhwaService {

    @Autowired
    private MangaManhwaRepository mangaManhwaRepository;

    //CRUD
    //metodo insert
    public MangaManhwa save(MangaManhwa entity) {
        return mangaManhwaRepository.save(entity);
    }

    //metodo select
    public MangaManhwa findById(Long id) {
        return mangaManhwaRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<MangaManhwa> findAll() {
        Iterable<MangaManhwa> iterable = mangaManhwaRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void deleteById(Long id) {
        mangaManhwaRepository.deleteById(id);
    }
}
