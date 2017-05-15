package JavaLessonStudentCode;

import java.util.ArrayList;
import java.util.List;

/* Enoncé des questions 1 à 4
 * Q01 : ajoutez à la classe un attribut prenom, de type string et privé
 * 
 * Q02 : ajoutez à la classe un attribut nom, de type string et privé
 * 
 * Q03 : ajoutez à la classe un attribut age, de type int et privé
 * 
 * Q04 : écrire les 3 getters pour les attributs prenom, nom et age
 * 		 les getters sont des méthodes qui ne prennent pas d'argument
 * 		 et renvoient la valeur de l'attribut associés. Les noms
 * 		 correspondent à ceux des attribut, précédés de get avec la première
 * 		 lettre du nom de l'attribut en majuscule.
 * 		 (NB : d'habitude on les génère automatiquement, mais faites le
 * 		 à la main au moins une fois) 
 */

/* Enoncé des questions 5 à 8
 * Q05 : écrire le setter pour l'attribut age. Il prend en argument un entier,
 * 		 et assigne à l'attribut age la valeur de cet entier
 * 
 * Q06 : ajoutez un constructeur qui prend trois arguments :
 * 			 => 1/  Un string pour le nom
 * 			 => 2/  Un string pour le prenom
 * 			 => 3/  Un int pour l'age
 * 	     Pour rappel un constructeur se définit comme une fonction, sans type 
 * 		 de retour et qui possède le même nom que la classe.
 * 
 * Q07 : définissez un deuxième constructeur qui prend en argument seulement
 * 		 le nom et le prénom (dans cet ordre), et donne à l'age la valeur par
 * 		 défaut -1 (on utilise souvent cette valeur pour dire qu'un entier
 * 		 n'est pas défini)
 * 
 *  	 Question bonus : on peut appeler un constructeur dans un autre avec
 *  	 la notation this( ... ), utiliser cette notation pour définir le 
 *  	 constructeur.
 *  
 * Q08 : Le nom et le prénom d'une personne ne pouvant raisonnablement changer,
 *       ajouter le qualifier final à ces deux attributs.
 *       Cela signifie qu'ils ne peuvent être modifiés après le constructeur.
 */

/* Enoncé des méthodes 9 à 12
 * 
 * Q09 : Méthode bonjour écrire une méthode direBonjour qui ne prend
 * 		 pas d'argument et affiche, avec un println, la phrase : 
 * 		 
 * 		 Bonjour, je m'appelle {prenom} {nom}
 * 
 *       Par exemple pour une personne qui s'appelle Jean Dupont, la 
 *       fonction affichera
 *       
 *       Bonjour, je m'appelle Jean Dupont
 */
public class Personne {
	private final String prenom;
	private final String nom;
	private int age;
	
	public String getNom() {
	    return nom;
	 }

	public String getPrenom() {
	return prenom;
	}

	public int getAge() {
	    return age;
	 }
	 public void setAge( int newAge) {
	      age = newAge;
	   }
	 
	// constructeur continent les nom et pr�nom et age
		public Personne(String nom, String prenom, Integer age) {
			this.nom=nom;
			this.prenom=prenom;
			this.age=age;
		}
	// constructeur contenant les nom et pr�nom 
		public Personne(String nom, String prenom) {
			this.nom=nom;
			this.prenom=prenom;
			setAge(-1);
		}
		
		public String  direBonjour() {
			String message=" ";
			message="Bonjour, je m'appelle : "; 
			return (message);  
		}
		public static void main(String[] args)  {
			 Personne moi = new Personne("Abdel","Nemmiche",51);
		     System.out.println(message+getNom(moi)+" "+getPrenom(moi));         
		
		}
		
}
