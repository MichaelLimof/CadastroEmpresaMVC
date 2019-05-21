package com.evento.ibm.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	
	private String nome_empresa;
	private String cnpj_empresa;
	private String razao_social;
	private String email_contato;
	private int 	telefone;
	private String area_medica;
	private boolean ativo;
	private String bairro_empresa; 
	private String rua_empresa; 
	private int numero_end; 
	private String cidade_empresa; 
	private String cep;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getCnpj_empresa() {
		return cnpj_empresa;
	}
	public void setCnpj_empresa(String cnpj_empresa) {
		this.cnpj_empresa = cnpj_empresa;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getEmail_contato() {
		return email_contato;
	}
	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getArea_medica() {
		return area_medica;
	}
	public void setArea_medica(String area_medica) {
		this.area_medica = area_medica;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getBairro_empresa() {
		return bairro_empresa;
	}
	public void setBairro_empresa(String bairro_empresa) {
		this.bairro_empresa = bairro_empresa;
	}
	public String getRua_empresa() {
		return rua_empresa;
	}
	public void setRua_empresa(String rua_empresa) {
		this.rua_empresa = rua_empresa;
	}
	public int getNumero_end() {
		return numero_end;
	}
	public void setNumero_end(int numero_end) {
		this.numero_end = numero_end;
	}
	public String getCidade_empresa() {
		return cidade_empresa;
	}
	public void setCidade_empresa(String cidade_empresa) {
		this.cidade_empresa = cidade_empresa;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}