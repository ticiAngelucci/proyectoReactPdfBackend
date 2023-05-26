package com.proyectoReact.proyectoReactBackend;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/usuario")
    public List < Usuario > getUsuarios() {
        return Arrays.asList(new Usuario("",1, "Core Java",1,1,"",""), new Usuario("",2, "Core Java",1,1,"",""), new Usuario("",3, "Core Java",1,1,"",""));
    }
}

class Usuario {
    private String docname;
    private int id_docname;
    private String documento;
    private int id_metadata;
    private int id_lista_email;
    private String fecha;
    private String url_callback;



    public Usuario(String docname,int id_docname,String documento,int id_metadata,int id_lista_email,String fecha,String url_callback) {
        super();
        this.docname = docname;
        this.id_docname = id_docname;
        this.documento = documento;
        this.id_metadata = id_metadata;
        this.id_lista_email = id_lista_email;
        this.fecha = fecha;
        this.url_callback = url_callback;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}