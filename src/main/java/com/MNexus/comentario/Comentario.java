package com.MNexus.comentario;

import java.sql.Date;

import com.MNexus.User.Users;
import com.MNexus.mangaManhwa.MangaManhwa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comentario {

    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String contenido;
    private Date fecha_comentario;

    @ManyToOne
    private Users users;

    @ManyToOne
    private MangaManhwa mangaManhwa;
}
