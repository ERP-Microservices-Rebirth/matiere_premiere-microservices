package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Mp implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	public Long id;
	public String nomProduit;
	public String quantite;
	public String typeProduit;
	public Long fournisseurId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public String getTypeProduit() {
		return typeProduit;
	}
	public void setTypeProduit(String typeProduit) {
		this.typeProduit = typeProduit;
	}
	public Long getFournisseurId() {
		return fournisseurId;
	}
	public void setFournisseurId(Long fournisseurId) {
		this.fournisseurId = fournisseurId;
	}
	public Mp(Long id, String nomProduit, String quantite, String typeProduit, Long fournisseurId) {
		super();
		this.id = id;
		this.nomProduit = nomProduit;
		this.quantite = quantite;
		this.typeProduit = typeProduit;
		this.fournisseurId = fournisseurId;
	}
	public Mp(String nomProduit, String quantite, String typeProduit, Long fournisseurId) {
		super();
		this.nomProduit = nomProduit;
		this.quantite = quantite;
		this.typeProduit = typeProduit;
		this.fournisseurId = fournisseurId;
	}
	@Override
	public String toString() {
		return "Mp [id=" + id + ", nomProduit=" + nomProduit + ", quantite=" + quantite + ", typeProduit=" + typeProduit
				+ ", fournisseurId=" + fournisseurId + "]";
	}
	public Mp() {
		super();
	}
	
	

	
}
