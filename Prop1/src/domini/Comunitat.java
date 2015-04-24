package domini;

import java.util.Map;
import java.util.TreeMap;

public class Comunitat {
	
	private int Identificador, Numero_categories; //crec que Numero_categories no fa falta
	private Map<String, Categoria> CategoriesComunitat;
	
	public Comunitat(int id) {
		Identificador = id;
		Numero_categories = 0;
		CategoriesComunitat = new TreeMap<String, Categoria>();
	}
	
	public Comunitat() {
		Identificador = -1; //Pau: mmm.. aixo podria donar problemes, podrien haver-hi dues comunitats amb el mateix 
							//     id, ho hauriem de parlar a classe. he vist que has posat que podria ser un string,
							//	   a mi tambe em sembla bé
		Numero_categories = 0;
		CategoriesComunitat = new TreeMap<String, Categoria>();
	}
	
	public int getId() {
		return Identificador;
	}
	
	public int getNumeroDeCategories() {
		return Numero_categories;
		//return CategoriesComunitat.size();	
	}
	
	public Categoria getCat(String key) {
		/* Pau: crec que aquesta comprovació és necessària no?
		* 
		* if (i < 0 or i >= Numero_categories) return null; */
		return CategoriesComunitat.get(key);
	}
	
	//si no se li passa el nom de la categoria l'hem d'agafar a traves d'un 
	//metode de la classe Categoria per tenir la Key
	public void addCat(Categoria c) {
		CategoriesComunitat.put(c.getNom(), c);
	}
	
	public void removeCat(String categoria) {
		CategoriesComunitat.remove(categoria);
	}
	
	public Map<String, Categoria> getMapCat() {
		return CategoriesComunitat;
	}
	
	public void setMapCat(Map<String, Categoria> mapa) {
		CategoriesComunitat.putAll(mapa);
	//això fa una copia de tot el mapa, no se si es la manera mes eficient de fer-ho
	}
	

}
