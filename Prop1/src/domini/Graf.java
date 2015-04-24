package domini;

import java.util.Map;
import java.util.TreeMap;

public class Graf {
	
	private Map<String, Categoria> Categories;
	private Map<String, Pagina> Pagines;
	
	
	public Graf() {
		Categories = new TreeMap<String, Categoria>();
		Pagines = new TreeMap<String, Pagina>();
	}
	
	//Pre: nom és una key de Categories amb una assignació
	//Post: retorna la assignació de nom a Categories
	public Categoria getCategoria(String nom) {
		return Categories.get(nom);
	}
	
	//Pre: nom és una key de Pagines amb una assignació
	//Post: retorna la assignació de nom a Pagines
	public Pagina getPagina(String nom) {
		return Pagines.get(nom);
	}
	
	//Pre: Cert
	//Post: Retorna el nombre de Categories que hi ha al graf
	public int getNombreCategories() {
		return Categories.size();
	}
	
	//Pre: Cert
	//Post: Retorna el nombre de Pàgines que hi ha al graf
	public int getNombrePagines() {
		return Pagines.size();
	}
	
	//Pre: cat no és l'assignació de cap key a Categories
	//Post: cat és l'assignació de la key cat.Nom
	public boolean addCategoria(Categoria cat) {
		if (Categories.containsKey(cat.getNom())) return false;
		Categories.put(cat.getNom(), cat);
		return true;
	}
	
	//Pre: pag no és l'assignació de cap key a Pagines
	//Post: pag és l'assignació de la key pag.Nom
	public boolean addPagina(Pagina pag) {
		Pagines.put(pag.getNom(), pag);
		return true;
	}
	
	/*
	public boolean addCC(Categoria cat1, Categoria cat2) {
		return true;
	}
	
	public boolean addPC(Pagina pag, Categoria cat) {
		return true;	
	}
	
	public boolean addCP(Categoria cat, Pagina pag) {
		return true;
	}
	
	public boolean removeCC(Categoria cat1, Categoria cat2) {
		return true;
	}
	
	public boolean removePC(Pagina pag, Categoria cat) {
		return true;
	}
	
	public boolean removeCP(Categoria cat, Pagina pag) {
		return true;
	}
	*/
	
	//Pre: nom és una key de Categories amb una assignació
	//Post: nom ja no és una key de Categories amb una assignació
	public boolean removeCategoria(String nom) {
		Categories.remove(nom);
		return true;
	}
	
	//Pre: nom és una key de Pagines amb una assignació
	//Post: nom ja no és una key de Pagines amb una assignació
	public boolean removePagina(String nom) {
		Pagines.remove(nom);
		return true;
	}
	
	//Pre: Cert
	//Post: retorna si existeix una Categoria assignada a nom
	public boolean existsCategoria(String nom) {
		return Categories.containsKey(nom);
	}

	//Pre: Cert
	//Post: retorna si existeix una Pagina assignada a nom
	public boolean existsPagina(String nom) {
		return Pagines.containsKey(nom);
	}
		

}
