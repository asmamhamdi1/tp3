public class laboratoire {
    public String nom;
    public String specialite;
    public adresse adresse A;
    public bureau B[];
    public laboratoire(String nom,String Specialite,Adresse A,Bureau B[])
    {
        this.nom=nom;
        this.specialite=specialite;
        this.A=A;
        this.B=new bureau[50];
        this.B=B;
    }
    public void afficher() 
    {
        System.out.println("Nom:" + nom + " Specialite:" + specialite);
        this.A.afficher();
        int i;
        int n=this.B.length;
        for (i = 0; i < n; i++)
        {
            this.B[i].afficher();
        }
    }
    public String toString(){
        String result="***"+nom+"****";
        result+=specialite;
        result +="adresse: "+A;
        int i;
        int n=this.B.length;
        for (i = 0; i < n; i++)
        {
            result+=this.B[i];;
        }
        for(bureau bb:b){
            if(bb!=null)
            result+=bb;
        }
        return result;

    }

}