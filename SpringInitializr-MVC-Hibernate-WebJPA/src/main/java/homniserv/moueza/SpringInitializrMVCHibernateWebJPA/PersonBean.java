package homniserv.moueza.SpringInitializrMVCHibernateWebJPA;

import javax.annotation.ManagedBean;

import org.springframework.stereotype.Component;

/**
 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html
 */
@Component
public class PersonBean {
	String nom;
	String prenom;
	int anneeNaissance;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
}
