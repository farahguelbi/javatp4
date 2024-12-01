public class Main {
        public static void main(String[] args) {
            // Création du dictionnaire avec un nom et une taille de 5 mots
            Dictionnaire dico = new Dictionnaire("Mon Dictionnaire", 5);
    
            // Ajout de mots dans le dictionnaire
            mot_dict mot1 = new mot_dict();
            mot1.setMot("Chat");
            mot1.setDefinition("Un petit félin domestique.");
    
            mot_dict mot2 = new mot_dict();
            mot2.setMot("Chien");
            mot2.setDefinition("Un canidé domestique fidèle.");
    
            mot_dict mot3 = new mot_dict();
            mot3.setMot("Souris");
            mot3.setDefinition("Un petit rongeur.");
    
            // Ajout des mots au dictionnaire
            dico.ajouter_Mot(mot1);
            dico.ajouter_Mot(mot2);
            dico.ajouter_Mot(mot3);
    
            // Lister les mots du dictionnaire
            System.out.println("Liste des mots dans le dictionnaire :");
            dico.listerDictionnaire();
    
            // Rechercher un mot dans le dictionnaire
            String definitionCherchee = dico.Recherche_dicho("Chien");
            System.out.println("Définition de 'Chien' : " + definitionCherchee);
    
            // Supprimer un mot du dictionnaire
            dico.Supprimer_Mot(mot1);
            System.out.println("Après suppression :");
            dico.listerDictionnaire();
    
            // Ajouter un autre mot
            mot_dict mot4 = new mot_dict();
            mot4.setMot("Lion");
            mot4.setDefinition("Un grand félin sauvage.");
    
            dico.ajouter_Mot(mot4);
            System.out.println("Après ajout de 'Lion' :");
            dico.listerDictionnaire();
    
            // Nombre de synonymes
            int nbSynonymes = dico.Nombre_Synonyme(mot3);
            System.out.println("Nombre de synonymes pour 'Souris' : " + nbSynonymes);
        }
    }
    