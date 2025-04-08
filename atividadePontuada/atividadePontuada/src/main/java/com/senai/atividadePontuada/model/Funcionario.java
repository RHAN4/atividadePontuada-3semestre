package com.senai.atividadePontuada.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tab_funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "CPF é obrigatório.")
    private String cpf;

    @NotBlank(message = "Data de nascimento é obrigatória.")
    private String dataNascimento;

    @NotBlank(message = "E-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @Positive(message = "Salário é obrigatório.")
    private double salario;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, String dataNascimento, String email, double salario, Genero genero, Setor setor, EstadoCivil estadoCivil, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.salario = salario;
        this.genero = genero;
        this.setor = setor;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "CPF é obrigatório.") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "CPF é obrigatório.") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "Data de nascimento é obrigatória.") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "Data de nascimento é obrigatória.") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotBlank(message = "E-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    @Positive(message = "Salário é obrigatório.")
    public double getSalario() {
        return salario;
    }

    public void setSalario(@Positive(message = "Salário é obrigatório.") double salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionário: " +
                "ID: " + id +
                ", nome: '" + nome + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", data de nascimento: '" + dataNascimento + '\'' +
                ", email: '" + email + '\'' +
                ", salário: " + salario +
                ", gênero: " + genero +
                ", setor: " + setor +
                ", estado cívil: " + estadoCivil +
                ", endereço: " + endereco;
    }
}
