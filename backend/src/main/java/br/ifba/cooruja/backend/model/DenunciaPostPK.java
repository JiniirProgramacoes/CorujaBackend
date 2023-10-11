package br.ifba.cooruja.backend.model;

import java.io.Serializable;
import jakarta.persistence.Embeddable;

@Embeddable
public class DenunciaPostPK implements Serializable {
    
    private int id_denuncia;
    private int id_post;
    private int id_usuario;

    public DenunciaPostPK(int id_denuncia, int id_post, int id_usuario) {
        this.id_denuncia = id_denuncia;
        this.id_post = id_post;
        this.id_usuario = id_usuario;
    }

    

}
