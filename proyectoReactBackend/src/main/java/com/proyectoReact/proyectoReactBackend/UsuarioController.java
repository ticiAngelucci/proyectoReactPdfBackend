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
    //Generamos los getters y setters
    public int getIdDocname() {
        return id_docname;
    }
    public String getDocname() {
        return docname;
    }
    public String getDocumento() {
        return documento;
    }
    public int getIdMetaData() {
        return id_metadata;
    }
    public int getIdListaEmail() {
        return id_lista_email;
    }
    public String getFecha() { return fecha; }
    public String getUrlCallback() { return url_callback; }

    public void setIdDocname(int id_docname) {
        this.id_docname = id_docname;
    }
    public void setDocumento( String documento) {
        this.documento = documento;
    }
    public void setDocname( String docname) {
        this.docname = docname;
    }
    public void setIdMetaData(int id_metadata) {
        this.id_metadata = id_metadata;
    }
    public void setIdListaEmail(int id_lista_email) {
        this.id_lista_email = id_lista_email;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setUrlCallback(String url_callback) {
        this.url_callback = url_callback;
    }
}