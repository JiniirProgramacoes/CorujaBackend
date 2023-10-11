package br.ifba.cooruja.backend.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="denuncia")
public class DenunciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "resolucao")
    private boolean resolucao;
    
    @OneToMany(mappedBy = "denuncia")
    private List<DenunciaPostModel> denunciaPostModel;
    
    public DenunciaModel() {
    }

    public DenunciaModel(Long id, boolean resolucao) {
        this.id = id;
        this.resolucao = resolucao;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isResolucao() {
        return this.resolucao;
    }

    public boolean getResolucao() {
        return this.resolucao;
    }

    public void setResolucao(boolean resolucao) {
        this.resolucao = resolucao;
    }

}
