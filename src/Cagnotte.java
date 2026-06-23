public class Cagnotte {

    private double solde = 0.0;
    private String nomCagnotte;

    public Cagnotte(String nomCagnotte) {
        this.nomCagnotte = nomCagnotte;
    }

    public synchronized void ajouterFonds(double montants) {
        double soldeActuel = this.solde;

        try {
            this.solde = soldeActuel + montants;
        }catch(Exception e) {
            System.err.println("Message d'erreur en cas d'erreur lors d'ajout de fond : "+e.getMessage());
        }
    }

    public synchronized void retirerFonds(double montants) {
        double soldeActuel = this.solde;

        try {
            this.solde = soldeActuel - montants;
        }catch(Exception e) {
            System.err.println("Message d'erreur en cas d'erreur lors de la suppression de fond : "+e.getMessage());
        }
    }

    public double getSolde() {
        return this.solde;
    }

    public String getNomCagnotte() {
        return this.nomCagnotte;
    }
}
