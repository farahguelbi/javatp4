public class Dictionnaire {
    private int nb_mots;
   private  mot_dict[] Dict;
    private String nom;
public  Dictionnaire(String nom ,int taille){
    this.nom=nom;
     Dict = new mot_dict[taille];
     this.nb_mots=0;
}
public void ajouter_Mot(mot_dict mot ){
    if (nb_mots < Dict.length) { 
    Dict[nb_mots] = mot; 
    nb_mots++; 
    trier(); 
} else {
    System.out.println("Le dictionnaire est plein!");
}
}
public void trier() {
    for (int i = 0; i < nb_mots - 1; i++) {
        for (int j = 0; j < nb_mots - i - 1; j++) {
            if (Dict[j].getMot().compareTo(Dict[j + 1].getMot()) > 0) {
                // Échange des éléments
                mot_dict temp = Dict[j];
                Dict[j] = Dict[j + 1];
                Dict[j + 1] = temp;
            }
        }
    }
}
public void Supprimer_Mot(mot_dict motASupprimer) {
    for (int i = 0; i < nb_mots; i++) {
        if (Dict[i].getMot().equals(motASupprimer.getMot())) { 
            for (int j = i; j < nb_mots - 1; j++) {
                Dict[j] = Dict[j + 1];
            }
            Dict[nb_mots - 1] = null; 
            nb_mots--; 
            System.out.println("Mot supprimé : " + motASupprimer.getMot());
            return; 
        }
    }
    System.out.println("Mot non trouvé : " + motASupprimer.getMot());
}
public String Recherche_dicho(String motCherche) {
    int gauche = 0;
    int droite = nb_mots - 1;

    while (gauche <= droite) {
        int milieu = (gauche + droite) / 2;
        int comparison = Dict[milieu].getMot().compareTo(motCherche);

        if (comparison == 0) {
            return Dict[milieu].getDefinition(); 
        } else if (comparison < 0) {
            gauche = milieu + 1; 
        } else {
            droite = milieu - 1; 
        }
    }
    return "Mot non trouvé"; 


}
public void listerDictionnaire() {
    for (int i = 0; i < nb_mots; i++) {
        System.out.println(Dict[i].getMot() + ": " + Dict[i].getDefinition());
    }
}
int Nombre_Synonyme(mot_dict mot){
    int count =0;
    for(int i=0;i<nb_mots;i++){
        if(Dict[i].synonyme(mot.getMot(), mot.getDefinition()))
        {
            count ++;
        }
    }return count;
}

}
