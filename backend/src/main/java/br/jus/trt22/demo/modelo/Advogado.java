package br.jus.trt22.demo.modelo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * Advogado
 */
@Entity
@Table(schema = "public")
public class Advogado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String nome;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    @Pattern(regexp = "([a-zA-Z0-9]{4}\\-[a-zA-Z]{2}$)", message = "O nº OAB deve ter o formato [a-zA-Z0-9]{4}-[a-zA-Z]{2}")
    private String oab;
    @NotEmpty
    private String telefone;

    public Advogado() {
    }

    public Advogado(Long id, String nome, String email, String oab, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.oab = oab;
        this.telefone = telefone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOab() {
        return this.oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Advogado)) {
            return false;
        }
        Advogado advogado = (Advogado) o;
        return Objects.equals(id, advogado.id) && Objects.equals(nome, advogado.nome)
                && Objects.equals(email, advogado.email) && Objects.equals(oab, advogado.oab)
                && Objects.equals(telefone, advogado.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, oab, telefone);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nome='" + getNome() + "'" + ", email='" + getEmail() + "'" + ", oab='"
                + getOab() + "'" + ", telefone='" + getTelefone() + "'" + "}";
    }

}