package br.ifba.cooruja.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="denuncia_post")
public class DenunciaPostModel {
    
    @Id
    @ManyToOne
    @JoinColumn(name="denuncia_id", referencedColumnName = "id")
    private DenunciaModel denunciaModel;

    @Id
    @ManyToOne
    @JoinColumn(name="post_id", referencedColumnName = "id")
    private PostModel postModel;

    @Id
    @ManyToOne
    @JoinColumn(name="usuario_id", referencedColumnName = "id")
    private UsuarioModel usuarioModel;

    @Column(name="motivo")
    private String motivo;

    @Column(name="descricao")
    private String descricao;



}
