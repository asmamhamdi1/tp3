public class chercheur {
    public String nom;
    public String poste;
    public int nmac;
    public static int nbc=0;
    public Chercheur(){
     
    nbc++;
    public String toString(){
        return "Nom: "+nom+"Poste: "+poste+"Nmac:"+ nmac;
    }
    }
    public chercheur(String nom,String poste,int nmac){
        this.nom=n;
        this.poste=p;
        this.nmac=nmac;
        nbc++;
    }
    public void afficher(){
            System.out.println("Nom= "+nom+"Poste= "+poste+" Nmac = "+numord); 
            }
        public boolean comparer(chercheur C) {
            if (this.nmac == C.nmac) {
                if (this.nom == C.nom) {
                    if (this.poste == C.poste)
                     {
                        return true;
                    }
                }
            }
            return false;
        }
        public void modifier(int c){
        nmac=c;
        }
        void ajouter(String nom,String poste,int nmac){
        this.nom=nom;
        this.poste=poste;
        this.nmac=nmac;
        }
}