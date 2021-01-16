package it.progettoordinijpamaven.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "articolo")
public class Articolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "descrizione")
	private String descrizione;
	@Column(name = "prezzo-singolo")
	private int prezzoSingolo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ordine_id")
	private Ordine ordine;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinTable(name = "articolo_categoria", joinColumns = @JoinColumn(name = "articolo_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "categoria_id", referencedColumnName = "id"))
	private Set<Categoria> categorie = new HashSet<Categoria>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getPrezzoSingolo() {
		return prezzoSingolo;
	}
	public void setPrezzoSingolo(int prezzoSingolo) {
		this.prezzoSingolo = prezzoSingolo;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	public Set<Categoria> getCategorie() {
		return categorie;
	}
	public void setCategorie(Set<Categoria> categorie) {
		this.categorie = categorie;
	}
	
	@Override
	public String toString() {
		return "Articolo [id =" + id + ", descrizione =" + descrizione + ", prezzo singolo =" + prezzoSingolo + ", ordine =" + ordine + "]";
	}
	
	public void addToCategorie(Categoria categoriaInstance) {
		this.categorie.add(categoriaInstance);
		categoriaInstance.getArticoli().add(this);
	}
	
	public void removeFromCategorie(Categoria categoriaInstance) {
		this.categorie.remove(categoriaInstance);
		categoriaInstance.getArticoli().remove(this);
	}
}
